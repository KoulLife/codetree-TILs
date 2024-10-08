import java.util.*;

class Person implements Comparable<Person>{
    int height, weight, idx;
    public Person(){}
    public Person(int h, int w, int i){
        this.height = h;
        this.weight = w;
        this.idx = i;
    }

    public int compareTo(Person p) {
        if(height == p.height) {
            return p.weight - weight;
        }
        return height - p.height;
    }
}

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Person[] people = new Person[n];

        for(int i = 0; i < n; i++) {
            int h = sc.nextInt();
            int w = sc.nextInt();
            Person person = new Person(h,w,i+1);
            people[i] = person;
        }

        Arrays.sort(people);

        for(int i = 0; i < n; i++) {
            System.out.printf("%d %d %d\n",
            people[i].height, people[i].weight, people[i].idx);
        }

    }
}
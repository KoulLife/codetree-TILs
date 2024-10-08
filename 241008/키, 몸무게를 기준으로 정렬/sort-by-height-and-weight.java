import java.util.*;

class Person implements Comparable<Person>{
    String name;
    int height, weight;
    public Person(){}
    public Person(String n, int h, int w) {
        this.name = n;
        this.height = h;
        this.weight = w;
    }

    @Override
    public int compareTo(Person p){
        if(this.height == p.height) {
            return p.weight - this.weight;
        }
        return this.height - p.height;
    }
}

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Person[] people = new Person[n];

        for(int i = 0; i < n; i++) {
            String name = sc.next();
            int height = sc.nextInt();
            int weight = sc.nextInt();
            Person person = new Person(name, height, weight);
            people[i] = person;
        }

        Arrays.sort(people);

        for(int i = 0; i < n; i++) {
            System.out.printf("%s %d %d\n",
            people[i].name,people[i].height,people[i].weight
            );
        }

    }
}
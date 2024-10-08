import java.util.*;

class Person {
    String name;
    int height;
    double weight;

    public Person(){}
    public Person(String n, int h, double w) {
        this.name = n;
        this.height = h;
        this.weight = w;
    }
}

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        Person[] people = new Person[5];

        for(int i = 0; i < 5; i++) {
            String n = sc.next();
            int h = sc.nextInt();
            double w = sc.nextDouble();
            Person person = new Person(n,h,w);
            people[i] = person;
        }

        Arrays.sort(people, (a,b) -> a.name.compareTo(b.name));
        System.out.println("name");
        for(int i = 0; i < 5; i++) {
            System.out.printf("%s %d %.1f\n", 
            people[i].name,people[i].height, people[i].weight);
        }
        System.out.println();
        Arrays.sort(people, (a,b) -> b.height - a.height);
        System.out.println("height");
        for(int i = 0; i < 5; i++) {
            System.out.printf("%s %d %.1f\n", 
            people[i].name,people[i].height, people[i].weight);
        }
    }
}
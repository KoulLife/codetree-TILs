import java.util.*;

class People implements Comparable<People> {
    
    String name;
    int height;
    int weight;

    public People(String name, int height, int weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public int compareTo(People people) {
        return this.height - people.height;
    }

}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        People[] arr = new People[n];

        for(int i = 0; i < n; i++) {
            String name = sc.next();
            int height = sc.nextInt();
            int weight = sc.nextInt();

            People people = new People(name, height, weight);

            arr[i] = people;
        }

        Arrays.sort(arr);

        for(int i = 0; i < n; i++) {
            System.out.println(arr[i].name + " " + arr[i].height + " " + arr[i].weight);
        }

    }
}
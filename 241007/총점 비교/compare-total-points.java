import java.util.*;

class T implements Comparable<T>{
    String name;
    int s1, s2, s3;
    public T(){}
    public T(String name, int s1, int s2, int s3){
        this.name = name;
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
    }

    @Override
    public int compareTo(T student){
        return (this.s1 + this.s2 + this.s3) - 
        (student.s1 + student.s2 + student.s3);
    }
}

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        T[] students = new T[n];

        for(int i = 0; i < n; i++) {
            String name = sc.next();
            int s1 = sc.nextInt();
            int s2 = sc.nextInt();
            int s3 = sc.nextInt();
            T t = new T(name, s1, s2, s3);
            students[i] = t;
        }

        Arrays.sort(students);

        for(int i = 0; i < n; i++) {
            System.out.printf("%s %d %d %d\n",
            students[i].name, students[i].s1, 
            students[i].s2, students[i].s3);
        }

    }
}
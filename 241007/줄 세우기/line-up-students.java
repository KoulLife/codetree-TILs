import java.util.*;

class Student implements Comparable<Student> {
    int h,w,idx;
    public Student(){};
    public Student(int h, int w, int idx){
        this.h = h;
        this.w = w;
        this.idx = idx;
    }

    @Override
    public int compareTo(Student s) {
        if(s.h == this.h){
            if (s.w == this.w){
                return s.idx - this.idx;
            }
            return s.w - this.w;
        }
        return s.h - this.h;
    }

}

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Student[] students = new Student[n];
        for(int i = 0; i < n; i++) {
            int h = sc.nextInt();
            int w = sc.nextInt();
            Student tmp = new Student(h,w,i+1);
            students[i] = tmp;
        }
        Arrays.sort(students);
        for(int i = 0; i < n; i++) {
            System.out.printf("%d %d %d\n", 
            students[i].h, students[i].w, students[i].idx);
        }



    }
}
import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int res = -1;
        int[] students = new int[n];
        for(int i = 0; i < n; i++)
            students[i] = k;
        for(int i = 0; i < m; i++){
            int loose = sc.nextInt();
            students[loose - 1]--;
            if(students[loose - 1] == 0){
                res = loose;
                break;
            }
        }

        System.out.println(res);

    }
}
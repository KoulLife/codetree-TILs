import java.util.*;

public class Main {

    public static int[] arr;

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < m; i++) {
            
            int l = sc.nextInt();
            int r = sc.nextInt();

            int sum = 0;

            for(int j = l-1; j <= r-1; j++) {
                sum += arr[j];
            }

            System.out.println(sum);
        }
    }
}
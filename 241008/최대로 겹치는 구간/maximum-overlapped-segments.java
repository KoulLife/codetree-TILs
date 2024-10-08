import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int offset = 100;
        int[] arr = new int[201];


        for(int i = 0; i < n; i++) {
            int x1 = sc.nextInt() + offset;
            int x2 = sc.nextInt() + offset;

            for(int j = x1; j <= x2; j++) {
                arr[j] += 1;
            }

        }

        int max = 0;

        for(int i = 0; i < 201; i++) {
            max = Math.max(max, arr[i]);
        }

        System.out.println(max);

    }
}
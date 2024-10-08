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

        int count = 0;

        for(int i = 0; i < 201; i++) {
            if(arr[i] >= 2) {
                count++;
            }
        }

        System.out.println(count);
    }
}
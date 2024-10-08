import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n + 1];

        for(int i = 0; i < k; i++) {
            int left = sc.nextInt();
            int right = sc.nextInt();

            for(int idx = left; idx <= right; idx++) {
                arr[idx] += 1;
            }

        }

        int maxNum = 0;

        for(int i = 0; i <= n; i++) {
            maxNum = Math.max(maxNum, arr[i]);
        }

        System.out.println(maxNum);

    }
}
import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int res = 0;

        for(int i = 0; i <= n-k; i++){
            int tmp = 0;
            for(int j = i; j < i + k; j++){
                tmp += arr[j];
            }
            res = Math.max(res, tmp);
        }
        System.out.println(res);
    }
}
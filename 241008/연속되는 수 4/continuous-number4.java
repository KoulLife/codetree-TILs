import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int ans = 0;
        int cnt = 0;

        for(int i = 0; i < n; i++) {
            if(i > 0 && arr[i] > arr[i - 1])
                cnt+=1;
            else
                cnt = 1;
            ans = Math.max(cnt, ans);
        }

        System.out.println(ans);

    }
}
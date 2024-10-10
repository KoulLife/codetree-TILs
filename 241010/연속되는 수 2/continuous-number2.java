import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int cnt = 0;
        int res = 0;
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if(i > 0 && arr[i - 1] == arr[i]) {
                cnt++;
            }
            else{
                cnt = 1;
            }
            res = Math.max(res,cnt);
        }

        System.out.println(res);

    }
}
import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int t = sc.nextInt();

        int cnt = 0;
        int res = 0;

        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if(arr[i] > 0 && arr[i] > t && arr[i] == arr[i - 1]+1){
                cnt++;
            }
            else if(arr[i] > t){
                cnt = 1;
            }
            else{
                cnt = 0;
            }
            res = Math.max(res, cnt);
        }

        System.out.println(res);

    }
}
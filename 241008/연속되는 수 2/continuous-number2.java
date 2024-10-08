import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int cnt = 0;

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if(i == 0 || arr[i - 1] != arr[i]) {
                cnt+=1;
            }
        }

        System.out.println(cnt);

    }
}
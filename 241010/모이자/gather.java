import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int minNum = Integer.MAX_VALUE;
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < n; i++){
            int tmp = 0;
            for(int j = 0; j < n; j++){
                tmp += arr[j] * Math.abs(j - i);
            }
            minNum = Math.min(tmp, minNum);
        }

        System.out.println(minNum);

    }
}
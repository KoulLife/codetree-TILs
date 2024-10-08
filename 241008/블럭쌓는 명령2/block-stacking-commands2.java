import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int k = sc.nextInt();
        int maxNum = 0;
        int res = -1;

        int[] arr = new int[n];

        for(int i = 0; i < k; i++) {
            
            int a = sc.nextInt();
            int b = sc.nextInt();

            for(int j = a; j <= b; j++) {
                arr[j-1] += 1;
            }

        }

        Arrays.sort(arr);

        for(int i = 0; i < k; i++){
            if (maxNum <= arr[i]){
                maxNum = arr[i];
                res = i;
            }
        }

        System.out.println(res);

    }
}
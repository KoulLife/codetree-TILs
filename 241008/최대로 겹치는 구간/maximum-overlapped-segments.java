import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int[] a1 = new int[100];
        int[] a2 = new int[100];

        int[] arr = new int[201];

        int n = sc.nextInt();

        for(int i = 0; i < n; i++) {
            a1[i] = sc.nextInt() + 100;
            a2[i] = sc.nextInt() + 100;
        }

        for(int i = 0; i < n; i++) {
            for(int j = a1[i]; j <= a2[i]; j++) {
                arr[j]++;
            }
        }

        int max = 0;

        for(int i = 0; i <= 200; i++)
            if(arr[i] > max){
                max = arr[i];
            }
        
        // 출력
        System.out.print(max);

    }
}
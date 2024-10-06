import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[10];

        for(int i = 0; i < n; i++) {
            int a = sc.nextInt();
            arr[a] += 1;
        }

        for(int j = 1; j < 10; j++) {
            System.out.println(arr[j]);
        }

    }
}
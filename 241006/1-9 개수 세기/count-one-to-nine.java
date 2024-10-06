import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[10];

        for(int i = 0; i < n; i++){
            int j = sc.nextInt();
            arr[j - 1] = 1;
        }

        for(int k = 0; k < 9; k++) {
            System.out.println(arr[k]);
        }

    }
}
import java.util.*;

public class Main {

    public static void test(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0) {
                arr[i] = arr[i] / 2;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        test(arr);

        for(int num : arr) {
            System.out.print(num + " ");
        }
    }
}
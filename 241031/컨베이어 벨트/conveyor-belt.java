import java.util.*;

public class Main {

    public static int[] arr1;
    public static int[] arr2;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int t = sc.nextInt();

        arr1 = new int[n];
        arr2 = new int[n];

        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }

        for (int i = 0; i < t; i++) {
            int tmp1 = arr1[n - 1];
            int tmp2 = arr2[n - 1];

            for (int j = n - 1; j >= 1; j--) {
                arr1[j] = arr1[j - 1];
                arr2[j] = arr2[j - 1];
            }

            arr1[0] = tmp2;
            arr2[0] = tmp1;
        }

        for(int data : arr1) {
            System.out.print(data + " ");
        }
        System.out.println();
        for(int data : arr2) {
            System.out.print(data + " ");
        }
    }
}
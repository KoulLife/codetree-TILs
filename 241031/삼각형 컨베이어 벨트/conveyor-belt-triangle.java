import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();

        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        int[] arr3 = new int[n];

        for (int i = 0; i < n; i++) {arr1[i] = sc.nextInt();}
        for (int i = 0; i < n; i++) {arr2[i] = sc.nextInt();}
        for (int i = 0; i < n; i++) {arr3[i] = sc.nextInt();}

        for (int k = 0; k < t; k++) {
            int tmp1 = arr1[n - 1];
            int tmp2 = arr2[n - 1];
            int tmp3 = arr3[n - 1];

            for (int i = n - 1; i >= 1; i--) {
                arr1[i] = arr1[i - 1];
                arr2[i] = arr2[i - 1];
                arr3[i] = arr3[i - 1];
            }
            
            arr1[0] = tmp3;
            arr2[0] = tmp1;
            arr3[0] = tmp2;
        }

        for(int data : arr1) {
            System.out.print(data + " ");
        } System.out.println();

        for(int data : arr2) {
            System.out.print(data + " ");
        } System.out.println();

        for(int data : arr3) {
            System.out.print(data + " ");
        }

    }
}
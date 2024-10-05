import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[3];

        Scanner sc = new Scanner(System.in);
        arr[0] = sc.nextInt();
        arr[1] = sc.nextInt();
        arr[2] = sc.nextInt();

        Arrays.sort(arr);
        System.out.println(arr[1]);

    }
}
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int res = 0;

        for(int i = 0; i < 10; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < 10; i++){
            res += arr[i];
        }

        System.out.println(res);
    }
}
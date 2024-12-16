import java.util.*;

public class Main {

    public static int N;
    public static int[] arr;

    public static int f1(int a, int b) {
        int stan = Math.max(a, b);
        for(int i = 1; i <= Math.min(a, b); i++) {
            if((stan * i) % a == 0 && (stan * i) % b == 0) {
                return stan * i;
            }
        }
        return 0;
    }

    public static int f2(int num) {
        if(num == N - 1) {
            return arr[num];
        }
        return f1(arr[num], f2(++num));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        arr = new int[N];

        for(int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(f2(0));
    }
}

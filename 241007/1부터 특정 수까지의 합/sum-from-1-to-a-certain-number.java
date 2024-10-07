import java.util.*;

public class Main {

    public static int test(int n) {
        int tmp = 0;
        for(int i = 1; i <= n; i++) {
            tmp += i;
        }
        return tmp / 10;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(test(n));
    }
}
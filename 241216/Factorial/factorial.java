import java.util.*;

public class Main {

    public static int fact(int n) {

        if(n == 0) { return 1; }

        if(n == 1) { return 1; }

        return n * fact(--n);
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        System.out.println(fact(n));
    }
}
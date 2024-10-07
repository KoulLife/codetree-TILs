import java.util.*;

public class Main {

    public static int test(int n) {
        if(n == 1) return 1;
        if(n == 2) return 2;
        return test(n/3) + test(n - 1);
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(test(n));

    }
}
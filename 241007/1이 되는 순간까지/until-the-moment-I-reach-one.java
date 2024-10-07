import java.util.*;

public class Main {

    public static int test(int n) {
        if(n == 1){return 0;}
        else if(n % 2 == 0) {
            n /= 2;
            return 1 + test(n);
        }
        else{
            n /= 3;
            return 1 + test(n);
        }
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(test(n));

    }
}
import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int res = 0;
        for(int i = 1; i <= n; i++) {
            if(res > n) {
                System.out.println("N");
                break;
            }
            if(res == n) {
                System.out.println("P");
                break;
            }
            if(n % i == 0) {
                res += i;
            }
        }

    }
}
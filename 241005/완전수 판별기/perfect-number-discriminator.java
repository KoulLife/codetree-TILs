import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int res = 0;

        for(int i = 1; i <= n/2; i++) {
            if(n % i == 0) {
                res += i;
            }
        }

        if (n == res) {
            System.out.println("P");
        }
        else{
            System.out.println("N");
        }

    }
}
import java.util.*;

public class Main {

    public static boolean isPrime(int n) {
        for(int i = 2; i < n; i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int addPrime(int a, int b) {
        
        int sum = 0;
        for(int i = Math.max(a,2); i <= b; i++) {
            if(isPrime(i)) {
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(addPrime(a,b));
    }
}
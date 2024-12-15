import java.util.*;

public class Main {

    public static int findMinNum(int n, int m) {
        
        int stan = (n > m) ? m : n;
        int res = 1;

        for(int i = 2; i <= n; i++) {
            if(m % i == 0 && n % i == 0) {
                res = i;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        System.out.println(findMinNum(n,m));
    }
}
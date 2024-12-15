import java.util.Scanner;

public class Main {

    public static int findMaxNum(int n, int m) {
        
        int stan = Math.max(n, m);
        int cnt = 1;
        
        while(true) {
            
            stan *= cnt;
            cnt++;

            if(stan % n == 0 && stan % m == 0) {
                return stan;
            }
        }
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        System.out.println(findMaxNum(n, m));
    }
}
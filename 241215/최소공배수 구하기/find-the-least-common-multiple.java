import java.util.Scanner;

public class Main {

    public static int findMaxNum(int n, int m) {
        int stan = 1;
        
        for(int i = 1; i <= Math.min(n,m); i++) {
            stan = Math.max(n,m) * i;

            if (stan % n == 0 && stan % m == 0) {
                break;
            }
        }
        return stan;
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        System.out.println(findMaxNum(n, m));
    }
}
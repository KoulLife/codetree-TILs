import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = 0;
        for(int i = 0; i < n; i++) {
            res += sc.nextInt();
        }
        System.out.printf("%d %.1f", res, (double)res/n);
    }
}
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String a = sc.next();
        int cnt = 0;

        for(int i = 0; i < n; i++) {
            String tmp = sc.next();
            if(tmp.compareTo(a) == 0) {
                cnt += 1;
            }
        }
        System.out.println(cnt);
    }
}
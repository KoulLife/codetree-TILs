import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        a += b;
        String s = Integer.toString(a);
        int cnt = 0;

        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '1') {
                cnt += 1;
            }
        }

        System.out.println(cnt);
    }
}
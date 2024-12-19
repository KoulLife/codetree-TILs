import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int a1 = sc.nextInt();
        int a2 = sc.nextInt();
        int b1 = sc.nextInt();
        int b2 = sc.nextInt();

        int res = 0;

        while(true) {
            if(a1 == b1 && a2 == b2) {
                break;
            }
            res += 1;
            a2++;
            if(a2 == 60) {
                a2 = 0;
                a1++;
            }
        }

        System.out.println(res);
    }
}
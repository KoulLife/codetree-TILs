import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        String t1 = a+b;
        String t2 = b+a;

        int res = Integer.parseInt(t1) + Integer.parseInt(t2);

        System.out.println(res);

    }
}
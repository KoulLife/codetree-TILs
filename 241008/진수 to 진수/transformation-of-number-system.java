import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String n = sc.next();

        int tmp = Integer.parseInt(n,a);
        String res = Integer.toString(tmp, b);
        System.out.println(res);

    }
}
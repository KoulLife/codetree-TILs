import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String res = "";
        int l = s.length();
        res = s.substring(1, l) + s.substring(0, 1);
        System.out.println(res);
    }
}
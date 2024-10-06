import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        char[] tmp = s.toCharArray();
        tmp[1] = 'a';
        tmp[s.length() - 2] = 'a';

        s = String.valueOf(tmp);

        System.out.println(s);

    }
}
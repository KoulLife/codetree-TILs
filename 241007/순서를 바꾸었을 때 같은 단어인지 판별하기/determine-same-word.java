import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String s1 = sc.next();
        String s2 = sc.next();

        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

        s1 = new String(c1);
        s2 = new String(c2);

        if(s1.equals(s2)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

    }
}
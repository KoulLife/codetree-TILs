import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String a = sc.nextLine();
        String b = sc.nextLine();
        int cnt = 0;
        for(int i = 0; i < a.length() - 1; i++) {
            String tmp = a.substring(i, i + 2);
            if(tmp.equals(b)){cnt += 1;}
        }
        System.out.println(cnt);
    }
}
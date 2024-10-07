import java.util.*;

public class Main {

    public static boolean contain369(int n) {
        String a = Integer.toString(n);
        if(a.contains("3") || a.contains("6") || a.contains("9")){
            return true;
        }else{
            return false;
        }
    }

    public static int check369(int a, int b) {
        int cnt = 0;
        for(int i = a; i <= b; i++) {
            if((i % 3 == 0) || contain369(i)) {
                cnt += 1;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(check369(a,b));

    }
}
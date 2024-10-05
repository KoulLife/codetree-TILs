import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        while(true){
            if(n == 2){
                cnt += 1;
                break;
                }
            n /= 2;
            cnt += 1;
        }
        System.out.println(cnt);
    }
}
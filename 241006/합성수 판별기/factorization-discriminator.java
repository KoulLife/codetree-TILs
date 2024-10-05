import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int cnt = 2;
        boolean check = false;
        while(cnt <= (n - 1)) {
            if(n % cnt == 0){
                check = true;
                break;
            }
            cnt += 1;
        }
        if(check){
            System.out.println("C");
        }else{
            System.out.println("N");
        }
    }
}
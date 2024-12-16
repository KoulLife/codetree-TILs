import java.util.*;

public class Main {

    public static int continueSum(int num) {
        
        if(num == 1) {
            return 1;
        }

        return num + continueSum(--num);
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(continueSum(n));
    }
}
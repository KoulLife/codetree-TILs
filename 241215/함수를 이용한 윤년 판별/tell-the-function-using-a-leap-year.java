import java.util.*;

public class Main {

    public static boolean divideFour(int n) {
        if(n % 4 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean divideHunit(int n) {
        if(!(n % 100 == 0 && n % 400 != 0)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int y = sc.nextInt();

        if(divideFour(y) && divideHunit(y)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
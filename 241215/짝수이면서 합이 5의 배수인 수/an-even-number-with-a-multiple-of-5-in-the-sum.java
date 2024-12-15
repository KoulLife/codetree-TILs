import java.util.*;

public class Main {

    public static void checkNum(int n) {
        if(n % 2 == 0 && checkEven(n)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");   
        }
    }

    public static boolean checkEven(int n) {
        int stan = (n / 10) + (n % 10);
        if(stan % 5 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        checkNum(n);
    }
}
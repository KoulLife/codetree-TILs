import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextIn();
        int b = sc.nextIn();
        int prod = 1;

        for(int i = a; i <= b; i++) {
            prod *= i;
        }
        
        System.out.println(prod);
    }
}
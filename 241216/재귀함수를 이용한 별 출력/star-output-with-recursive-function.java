import java.util.*;

public class Main {

    public static int N;

    public static void printStart(int n) {
        if(n > N) 
            return;
        for(int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.println();
        printStart(n + 1);
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        printStart(1);
    }
}
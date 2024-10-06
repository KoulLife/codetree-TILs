import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int maxNum = 0;

        for(int i = 0; i < 10; i++) {
            int a = sc.nextInt();
            maxNum = Math.max(a, maxNum);
        }

        System.out.println(maxNum);

    }
}
import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int m = 0;

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        while(true) {
            if(a == c && b == d) 
                break;
            
            b++;
            m++;

            if(b == 60){
                a++;
                b = 0;
            }
        }

        System.out.println(m);

    }
}
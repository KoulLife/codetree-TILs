import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int[] month = new int[]{31,28,31,30,31,30,31,31,30,31,30,31};

        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        int res = 0;

        while(true) {
            if(m1 == m2 && d1 == d2) {
                break;
            }
            d1++;
            res++;
            if(d1 > month[m1 - 1]){
                m1++;
                d1=1;
            }
        }
        System.out.println(res+1);

    }
}
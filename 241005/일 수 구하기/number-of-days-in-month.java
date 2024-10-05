import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        
        if(m <= 7){
            if (m == 2) {
                System.out.println(28);
            }
            else if(m % 2 == 0) {
                System.out.println(30);
            }
            else{
                System.out.println(31);
            }
        }
        else {
            if(m % 2 == 0){
                System.out.println(31);
            }else{
                System.out.println(30);
            }
        }
        

    }
}
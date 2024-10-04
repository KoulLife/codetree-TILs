import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int tmp = 0;
        if(a < b){
            tmp = a;
        }else{
            tmp = b;
        }
        if(tmp > c){tmp = c;}

        if(a == tmp){
            System.out.print("1 ");
        }else{
            System.out.print("0 ");
        }

        if(a == b && a == c){
            System.out.print("1 ");
        }else{
            System.out.print("0 ");
        }
    }
}
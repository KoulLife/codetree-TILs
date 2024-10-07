import java.util.*;

public class Main {

    public static boolean checkCal(int m, int d) {
        if(m <= 7){
            if(m == 2){
                if(d <= 28){return true;}
                else {return false;}
            }
            else if(m % 2 == 0) {
                if(d >= 31) {return false;}
                else{return true;}
            }
            else {
                if(d <= 31){return true;}
                else{return false;}
            }
        }

        else if(m <= 12){
            if(m % 2 == 0){
                if(d <= 31){return true;}
                else{return false;}
            }
            else{
                if(d >= 31) {return false;}
                else{return true;}
            }
        }

        else{
            return false;
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int d = sc.nextInt();

        if(checkCal(m,d)){System.out.println("Yes");}
        else{System.out.println("No");}

    }
}
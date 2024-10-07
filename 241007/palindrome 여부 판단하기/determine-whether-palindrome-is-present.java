import java.util.*;

public class Main {

    public static boolean checkP(String s){
        char[] cArr = s.toCharArray();
        String tmp = "";
        for(int i = cArr.length - 1; i >= 0; i--){
            tmp += cArr[i];
        }
        if(s.equals(tmp)){return true;}
        else{return false;}
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if(checkP(s)) {System.out.println("Yes");}
        else {System.out.println("No");}
    }
}
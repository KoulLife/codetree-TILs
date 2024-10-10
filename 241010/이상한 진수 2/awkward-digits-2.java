import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String num = sc.next();
        int res = 0;
        for(int i = 0; i < num.length(); i++){
            char[] numArr = num.toCharArray();
            if(numArr[i] == '1') numArr[i] = '0';
            else if(numArr[i] == '0') numArr[i] = '1';
            String tmp = String.valueOf(numArr);
            res = Math.max(res, Integer.parseInt(tmp,2));
        }

        System.out.println(res);

    }
}
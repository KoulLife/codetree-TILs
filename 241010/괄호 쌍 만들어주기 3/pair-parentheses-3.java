import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String pt = sc.next();
        int res = 0;

        for(int i = 0; i < pt.length(); i++){
            char a = pt.charAt(i);
            for(int j = i + 1; j < pt.length(); j++){
                char b = pt.charAt(j);
                if(a == '(' && b == ')'){
                    res++;
                }
            }
        }

        System.out.println(res);

    }
}
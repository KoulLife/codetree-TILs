import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String res = "";

        for(int i = 0; i < 2; i++) {
            String str = sc.nextLine();
            for(int j = 0; j < str.length(); j++) {
                if(str.charAt(j) != ' '){
                    res += str.charAt(j);
                }
            }
        }

        System.out.println(res);

    }
}
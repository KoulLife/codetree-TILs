import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String arr = "";

        for(int i = 0; i < n; i++){
            char a = sc.next().charAt(0);
            arr += a;
            
            if((i + 1) % 2 != 0) {
                char[] tmp = arr.toCharArray();
                Arrays.sort(tmp);
                System.out.print(tmp[i/2] + " ");
            }
            
        }

    }
}
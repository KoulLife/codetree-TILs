import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String arr = sc.nextLine();

        for(int i = 0; i < arr.length(); i++) {
            if(arr.charAt(i) >= 'A' && arr.charAt(i) <= 'z') {
                if(arr.charAt(i) > 'Z'){
                    System.out.print((char)(arr.charAt(i) - 'a' + 'A'));    
                }
                else{
                    System.out.print(arr.charAt(i));
                }
                
            }
        }

    }
}
import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new  Scanner(System.in);

        String[] arr = new String[]{ "apple", "banana", "grape", "blueberry", "orange"};
        char n = sc.next().charAt(0);

        int cnt = 0;

        for(int i = 0; i < 5; i++) {
            for(int j = 2; j <= 3; j++) {
                if(arr[i].charAt(j) == n){
                    System.out.println(arr[i]);
                    cnt += 1;
                    break;
                }
            }
        }
        System.out.println(cnt);

    }
}
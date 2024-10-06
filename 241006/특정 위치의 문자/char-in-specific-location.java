import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        char[] arr = new char[]{'L', 'E', 'B', 'R', 'O', 'S'};
        int idx = -1;
        char a = sc.next().charAt(0);

        for(int i = 0; i < 6; i++) {
            if(arr[i] == a) {
                idx = i;
            }
        }

        if(idx == -1) {
            System.out.println("None");
        }
        else{
            System.out.println(idx);
        }

    }
}
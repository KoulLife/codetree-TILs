import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int[] arr = new int[20];
        int cnt = 0;

        while(true) {
            if(num < 2){
                arr[cnt++] = num;
                break;
            }
            arr[cnt++] = num%2;
            num /= 2;
        }

        for(int i = cnt-1; i >= 0; i--) {
            System.out.print(arr[i]);
        }
    }
}
import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        char[] arr = new char[101];

        int n = sc.nextInt();
        int maxIdx = 0;

        for(int i = 0; i < n; i++) {
            int idx = sc.nextInt();
            char dir = sc.next().charAt(0);
            maxIdx = Math.max(idx, maxIdx);
            
            for(int j = 0; j < idx; j++) {
                arr[j] = dir;
            }
        }
        int numL = 0;
        int numR = 0;

        for(int i = 0; i < maxIdx; i++) {
            if(arr[i] == 'L') {
                numL+=1;
            }
            else if(arr[i] == 'R'){
                numR+=1;
            }
        }

        System.out.printf("%d %d", numL, numR);

    }
}
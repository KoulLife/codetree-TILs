import java.util.*;

public class Main {

    public static final int MAX = 1000000;
    public static int[] posA = new int[MAX + 1];
    public static int[] posB = new int[MAX + 1];

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int left = 1;
        for(int i = 0; i < n; i++) {
            int mov = sc.nextInt();
            char dir = sc.next().charAt(0);
            while(mov-- > 0){
                if(dir == 'L')
                    posA[left] = posA[left - 1] - 1;
                else
                    posA[left] = posA[left - 1] + 1;
                left++;
            }
        }

        int right = 1;
        for(int i = 0; i < m; i++) {
            int mov = sc.nextInt();
            char dir = sc.next().charAt(0);
            while(mov-- > 0) {
                if(dir == 'R')
                    posB[right] = posB[right - 1] + 1;
                else   
                    posB[right] = posB[right - 1] - 1;
                right++;
            }            
        }

        if(left < right) {
            for(int i = left; i < right; i++) {
                posA[i] = posA[i - 1];
            }
        }
        else if(left > right) {
            for(int i = right; i < left; i++) {
                posB[i] = posB[i - 1];
            }
        }

        int ans = 0;
        int timeMax = 0;
        if(left < right)
            timeMax = right;
        else
            timeMax = left;
        

        for(int i = 1; i < timeMax; i++) {
            if(posA[i] == posB[i] && posA[i-1] != posB[i-1]){
                ans++;
            }
        }

        System.out.println(ans);
    }
}
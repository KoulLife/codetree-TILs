import java.util.*;

public class Main {

    public static final int MAX = 100000;
    public static int[] posA = new int[MAX + 1];
    public static int[] posB = new int[MAX + 1];

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int left = 1;
        for(int i = 0; i < n; i++) {
            int v = sc.nextInt();
            int t = sc.nextInt();
            while(t-- > 0){
                posA[left] = posA[left - 1] + v;
                left ++;
            }
        }

        int right = 1;
        for(int i = 0; i < m; i++) {
            int v = sc.nextInt();
            int t = sc.nextInt();
            while(t-- > 0){
                posB[right] = posB[right - 1] + v;
                right++;
            }
        }

        int ans = 0;
        int win = 0;
        for(int i = 0; i < left; i++) {
            if(posA[i] > posB[i]){
                if(win == 2)
                    ans += 1;
                win = 1;
            }
            else if(posA[i] < posB[i]){
                if(win == 1)
                    ans += 1;
                win = 2;
            }
        }
        System.out.println(ans);
    }
}
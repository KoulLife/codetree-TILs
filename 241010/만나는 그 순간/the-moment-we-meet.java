import java.util.*;

public class Main {

    public static int[] posA = new int[1001];
    public static int[] posB = new int[1001];

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int leftMove = 1;
        for(int i = 0; i < n; i++){
            char dir = sc.next().charAt(0);
            int mov = sc.nextInt();

            while(mov > 0){
                if(dir == 'R'){
                    posA[leftMove] = posA[leftMove - 1] + 1;
                }
                else{
                    posA[leftMove] = posA[leftMove - 1] - 1;
                }
                mov--;
                leftMove++;
            }
        }

        int rightMove = 1;
        for(int i = 0; i < m; i++){
            char dir = sc.next().charAt(0);
            int mov = sc.nextInt();
            while(mov > 0) {
                if(dir == 'R'){
                    posB[rightMove] = posB[rightMove - 1] + 1;
                }
                else{
                    posB[rightMove] = posB[rightMove - 1] - 1;
                }
                mov--;
                rightMove++;
            }
        }

        int ans = -1;
        for(int i = 1; i < leftMove; i++) {
            if(posA[i] == posB[i]){
                ans = i;
                break;
            }
        }

        System.out.print(ans);

    }
}
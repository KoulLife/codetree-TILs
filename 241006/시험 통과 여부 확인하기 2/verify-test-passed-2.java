import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] arr = new int[n][4];
        int cnt = 0;

        for(int i = 0; i <n; i++){
            for(int j = 0; j < 4; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i <n; i++){
            int tmp = 0;
            for(int j = 0; j < 4; j++){
                tmp += arr[i][j];
            }
            if(tmp/4 >= 60){
                System.out.println("pass");
                cnt += 1;
            }
            else{
                System.out.println("fail");
            }
        }
        
        System.out.println(cnt);
    }
}
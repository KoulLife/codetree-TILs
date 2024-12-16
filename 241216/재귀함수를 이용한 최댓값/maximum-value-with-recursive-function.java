import java.util.*;

public class Main {

    public static int N;
    public static int[] arr;

    public static int findMaxNum(int n) {
            
            if(n == (N-1)) {
                return arr[n];
            }

            return Math.max(arr[n], findMaxNum(++n));
        }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        
        N = sc.nextInt();
        arr = new int[N];

        for(int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(findMaxNum(0));
    }
}
import java.util.*;

public class Main {

    public static int test(int[] arr, int n) {
        int max = Arrays.stream(arr).max().getAsInt(); 
        int cnt = 0;
        for(int i = 0; i < arr.length; i++) {
            if((max * n) % arr[i] != 0){
                cnt += 1;
                break;
            }
        }
        if (cnt == 0) {
            return max * n; // 반환 값이 있어야 함
        } else {
            return test(arr, n + 1); // 재귀 호출의 반환 값을 반환해야 함
        }
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(test(arr, 1));

    }
}
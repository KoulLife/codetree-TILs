import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n * 2];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int left = 0;
        int right = n * 2 - 1;
        int res = 0;

        while(left < right) {
            res = Math.max(res, arr[left] + arr[right]);
            left++;
            right--;
        }

        System.out.println(res);
    }
}
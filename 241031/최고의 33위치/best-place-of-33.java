import java.util.*;

public class Main {

    public static int [][] arr;

    public static int sumArr(int x, int y) {
        int sum = 0;
        for (int i = y - 2; i <= y; i++) {
            for (int j = x - 2; j <= x; j++) {
                sum += arr[i][j];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        arr = new int[n][n];

        for (int y = 0; y < n; y++) {
            for (int x = 0; x < n; x++) {
                arr[y][x] = sc.nextInt();
            }
        }

        int maxSum = 0;

        for (int y = 2; y < n; y++) {
            for (int x = 2; x < n; x++) {
                maxSum = Math.max(maxSum, sumArr(x,y));
            }
        }

        System.out.println(maxSum);
    }
}
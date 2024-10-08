import java.util.*;

public class Main {

    public static final int OFFSET = 1000;
    public static final int MAX_NUM = 2000;

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[MAX_NUM + 1][MAX_NUM + 1];

        int aX1 = sc.nextInt();
        int aY1 = sc.nextInt();
        int aX2 = sc.nextInt();
        int aY2 = sc.nextInt();

        int bX1 = sc.nextInt();
        int bY1 = sc.nextInt();
        int bX2 = sc.nextInt();
        int bY2 = sc.nextInt();

        int mX1 = sc.nextInt();
        int mY1 = sc.nextInt();
        int mX2 = sc.nextInt();
        int mY2 = sc.nextInt();

        for(int x = aX1; x < aX2; x++) {
            for(int y = aY1; y < aY2; y++) {
                arr[x][y] += 1;
            }
        }

        for(int x = bX1; x < bX2; x++) {
            for(int y = bY1; y < bY2; y++) {
                arr[x][y] += 1;
            }
        }

        for(int x = mX1; x < mX2; x++) {
            for(int y = mY1; y < mY2; y++) {
                arr[x][y] = 0;
            }
        }

        int area = 0;

        for(int x = 0; x <= MAX_NUM; x++ ) {
            for(int y = 0; y <= MAX_NUM; y++) {
                if(arr[x][y] > 0){
                    area+=1;
                }
            }
        }

        System.out.println(area);

    }
}
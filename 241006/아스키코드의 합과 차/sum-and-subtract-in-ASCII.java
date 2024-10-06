import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[]arr = new int[2];
        int minNum = 0;
        int maxNum = 0;

        for(int i = 0; i < 2; i++) {
            arr[i] = (int)sc.next().charAt(0);
        }

        if(arr[0] > arr[1]){
            minNum = arr[1];
            maxNum = arr[0];
        }else{
            maxNum = arr[1];
            minNum = arr[0];
        }

        System.out.print((maxNum + minNum) + " " + (maxNum - minNum));

    }
}
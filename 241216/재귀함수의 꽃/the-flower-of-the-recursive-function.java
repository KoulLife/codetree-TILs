import java.util.*;

public class Main {

    public static int N;

    public static void printNum(int num){
        if(num == 0)
            return;
        System.out.print(num + " ");
        printNum(--num);
    }

    public static void printReverseNum(int num){
        if(num > N)
            return;
        System.out.print(num + " ");
        printReverseNum(++num);
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();

        printNum(N);
        printReverseNum(1);
    }
}
import java.util.*;

public class Main {

    public static boolean checkFour(int year) {
        if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }

    public static void printSeason(int m) {
        switch(m) {
            case 1:
            case 2:
            case 12:
                System.out.println("Winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Fall");
                break;
        }
    }

    public static void main(String[] args) {
        int[] maxDate = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int y = sc.nextInt();
        int m = sc.nextInt();
        int d = sc.nextInt();

        if (maxDate[m - 1] >= d) {
            if (m == 2 && d >= 29 && checkFour(y)) {
                printSeason(m);
            } else{
                System.out.println("-1");
            }
        } else {
            System.out.println("-1");
        }
    }
}
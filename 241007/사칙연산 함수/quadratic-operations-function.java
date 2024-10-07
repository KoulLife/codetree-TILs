import java.util.*;

public class Main {

    public static int plus(int a, int b){return a+b;}
    public static int minus(int a, int b){return a-b;}
    public static int multiple(int a, int b){return a*b;}
    public static int divide(int a, int b){return a/b;}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        char c = sc.next().charAt(0);
        int b = sc.nextInt();

        switch(c) {
            case '+':
            System.out.println(a+" "+c+" "+b+" = " + plus(a,b));
            break;

            case '-':
            System.out.println(a+" "+c+" "+b+" = " + minus(a,b));
            break;

            case '*':
            System.out.println(a+" "+c+" "+b+" = " + multiple(a,b));
            break;

            case '/':
            System.out.println(a+" "+c+" "+b+" = " + divide(a,b));
            break;

            default:
            System.out.println("False");
            break;
        }

    }
}
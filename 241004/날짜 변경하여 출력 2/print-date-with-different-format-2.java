import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        String[] arr = n.split("-");
        System.out.printf(arr[2] + "." + arr[0] + "." + arr[1]);
    }
}
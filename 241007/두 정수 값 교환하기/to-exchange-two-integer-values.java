import java.util.*;

class Num{
    int a;
    public Num(int num){this.a = num;}
}

public class Main {

    public static void swap(Num n1, Num n2){
        int tmp = n1.a;
        n1.a = n2.a;
        n2.a = tmp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        Num n1 = new Num(a);
        Num n2 = new Num(b);

        swap(n1, n2);

        System.out.print(n1.a + " " + n2.a);
    }
}
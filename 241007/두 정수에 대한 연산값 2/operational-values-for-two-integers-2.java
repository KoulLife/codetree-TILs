import java.util.*;

class Num {
    int val;
    public Num(int n) {
        this.val = n;
    }
}

public class Main {

    public static void test(Num n1, Num n2) {
        n1.val *= 2;
        n2.val += 10;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        Num num1 = new Num(n1);
        Num num2 = new Num(n2);

        if(n1 >= n2){test(num1, num2);}
        else{test(num2, num1);}

        System.out.print(num1.val + " " + num2.val);

    }
}
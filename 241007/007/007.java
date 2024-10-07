import java.util.*;

class Tree{
    String s;
    char m;
    int t;
    public Tree(String s, char m, int t){
        this.s = s;
        this.m = m;
        this.t = t;
    }
}

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        char m = sc.next().charAt(0);
        int t = sc.nextInt();

        Tree tree = new Tree(s,m,t);

        System.out.println("secret code : " + tree.s);
        System.out.println("meeting point : " + tree.m);
        System.out.println("time : " + tree.t);

    }
}
import java.util.*;

class P implements Comparable<P> {
    String name = "";
    int kor = 0;
    int en = 0;
    int math = 0;

    public P(){}

    public P (String n, int a, int b, int c){
        this.name = n;
        this.kor = a;
        this.en = b;
        this.math = c;
    }

    @Override
    public int compareTo(P b){
        if(this.kor == b.kor){
            if(this.en == b.en){
                return b.math - this.math;
            }
            return b.en - this.en;
        }
        return b.kor - this.kor;
    }

}

public class Main {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        P[] pArr = new P[n];

        for(int i = 0; i < n; i++) {
            String name = sc.next();
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            P p = new P(name,a,b,c);
            pArr[i] = p;

        }

        Arrays.sort(pArr);

        for(int i = 0; i < n; i++) {
            System.out.printf("%s %d %d %d\n", 
            pArr[i].name, pArr[i].kor, pArr[i].en, pArr[i].math);
        }

    }
}
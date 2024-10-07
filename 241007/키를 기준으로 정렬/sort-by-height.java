import java.util.*;

class P {
    String name = "";
    int height = 0;
    int weight = 0;

    public P(){}
    public P(String n, int h, int w){
        this.name = n;
        this.height = h;
        this.weight = w;
    }
}

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        P[] pArr = new P[n];

        for(int i = 0; i < n; i++) {
            String name = sc.next();
            int height = sc.nextInt();
            int weight = sc.nextInt();
            

            P p = new P(name, height, weight);
            pArr[i] = p;
        }

        Arrays.sort(pArr, (a,b) -> a.height - b.height);

        for(int i = 0; i < n; i++) {
            System.out.printf("%s %d %d\n", 
            pArr[i].name, pArr[i].height, pArr[i].weight);
        }

    }
}
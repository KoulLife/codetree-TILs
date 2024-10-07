import java.util.*;

class Code {
    char name = ' ';
    int score = 0;

    public Code(){}

    public Code(char n, int s){
        this.name = n;
        this.score = s;
    }
}

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Code[] codes = new Code[5];
        int minScore = 0;
        int minIdx = 0;

        for(int i = 0; i < 5; i++) {
            char a = sc.next().charAt(0);
            int b = sc.nextInt();

            Code code = new Code(a,b);
            codes[i] = code;

            minScore = Math.min(minScore, a);
            if(a == minScore) minIdx = i;
        }

        System.out.print(codes[minIdx].name + " " + codes[minIdx].score);
        

    }
}
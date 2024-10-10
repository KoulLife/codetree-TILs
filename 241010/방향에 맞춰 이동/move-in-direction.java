import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int x = 0;
        int y = 0;

        int[] dx = new int[]{-1,0,0,1};
        int[] dy = new int[]{0,-1,1,0};

        int n = sc.nextInt();

        for(int i = 0; i < n; i++) {
            char dir = sc.next().charAt(0);
            int spd = sc.nextInt();
            int tmp = -1;

            if(dir == 'W') tmp = 0;
            else if(dir == 'S') tmp = 1;
            else if(dir == 'N') tmp = 2;
            else if(dir == 'E') tmp = 3;

            x += dx[tmp] * spd;
            y += dy[tmp] * spd;

        }

        System.out.print(x + " " + y);

    }
}
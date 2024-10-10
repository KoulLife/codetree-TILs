import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int[] dx = new int[]{1, 0, -1, 0};
        int[] dy = new int[]{0, -1, 0, 1};

        int nx = 0;
        int ny = 0;
        int dirNum = 3;

        String dirs = sc.next();

        for(int i = 0; i < dirs.length(); i++){
            char cDir = dirs.charAt(i);
            if(cDir == 'L')
                dirNum = (dirNum - 1 + 4) % 4;
            else if(cDir == 'R')
                dirNum = (dirNum + 1) % 4;
            else{
                nx += dx[currDir];
                ny += dy[currDir];
            }
        }

        System.out.printf("%d %d", nx,ny);

    }
}
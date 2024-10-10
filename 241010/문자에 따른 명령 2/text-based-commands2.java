import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int[] dx = new int[]{1, 0, -1, 0};
        int[] dy = new int[]{0, -1, 0, 1};

        int nx = 0;
        int ny = 0;
        int dirNum = 3;

        String com = sc.next();
        char[] dir = new char[100000];
        dir = com.toCharArray();

        for(int i = 0; i < dir.length; i++) {
            if (dir[i] == 'L'){
                dirNum -= 1;
            }
            else if(dir[i] == 'R'){
                dirNum += 1;
            }
            else if(dir[i] == 'F'){
                nx += dx[dirNum % 4];
                ny += dy[dirNum % 4];
            }
        }
        System.out.printf("%d %d", nx,ny);

    }
}
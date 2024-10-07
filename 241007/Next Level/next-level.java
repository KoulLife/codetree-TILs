import java.util.*;

class Level {
    String id;
    int lv;

    public Level(){
        id = "codetree";
        lv = 10;
    }

    public Level(String id, int lv) {
        this.id = id;
        this.lv = lv;
    }
}

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        Level lv1 = new Level();

        String id = sc.next();
        int lv = sc.nextInt();
        Level lv2 = new Level(id, lv);

        System.out.printf("user %s lv %d\n",lv1.id, lv1.lv);
        System.out.printf("user %s lv %d\n",lv2.id, lv2.lv);

    }
}
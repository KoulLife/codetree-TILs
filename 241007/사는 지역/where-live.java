import java.util.*;

class Location {
    String n=" ";
    String p=" ";
    String a=" ";
    public Location(){}
    public Location(String n,String p,String a){
        this.n = n;
        this.p = p;
        this.a = a;
    }
}

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] name = new String[n];

        Location[] loc = new Location[n];

        for(int i = 0; i < n; i++) {
            String n1 = sc.next();
            String p1 = sc.next();
            String a1 = sc.next();
            name[i] = n1;
            Location l = new Location(n1,p1,a1);
            loc[i] = l;
        }

        Arrays.sort(name, Collections.reverseOrder());
        String firstName = name[0];

        for(int i = 0; i < n; i++) {
            if((loc[i].n).equals(firstName)){
                System.out.println("name " + loc[i].n);
                System.out.println("addr " + loc[i].p);
                System.out.println("city " + loc[i].a);

                break;
            }
        }

    }
}
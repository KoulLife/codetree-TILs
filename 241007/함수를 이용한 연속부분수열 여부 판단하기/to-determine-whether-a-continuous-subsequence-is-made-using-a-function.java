import java.util.*;

public class Main {

    public static boolean checkNum(int[] a1, int[] a2) {
        String s1 = "";
        String s2 = "";
        for(int i = 0; i < a1.length; i++) {
            if(i < a2.length){
                s2 += Integer.toString(a2[i]);
            }
            s1 += Integer.toString(a1[i]);
        }

        if(s1.contains(s2)){return true;}
        else{return false;}

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int [] arr1 = new int[a];
        int [] arr2 = new int[b];

        if(checkNum(arr1, arr2)){System.out.println("Yes");}
        else{System.out.println("No");}
    }
}
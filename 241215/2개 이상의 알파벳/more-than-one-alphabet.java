import java.util.*;

public class Main {

    public static int func1(char[] arr) {

        ArrayList<Character> list = new ArrayList<>(); 
        list.add(arr[0]);
        
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] != arr[i - 1] && !(list.contains(arr[i]))) {
                list.add(arr[i]);
            }
        }

        return list.size();
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        char[] arr = str.toCharArray();
        if(func1(arr) >= 2) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
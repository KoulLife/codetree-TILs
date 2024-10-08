import java.util.*;

class T implements Comparable<T>{
    int num, idx;
    public T(){}
    public T(int n, int i){
        this.num = n;
        this.idx = i;
    }

    @Override
    public int compareTo(T t) {
        if(this.num == t.num){
            return this.idx - t.idx;
        }
        return this.num - t.num;
    }
}

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        T[] ts = new T[n];
        T[] tsClone = new T[n];
        int[] res = new int[n];

        for(int i = 0; i < n; i++) {
            int num = sc.nextInt();
            T t = new T(num, i + 1);
            ts[i] = t;
            tsClone[i] = t;
        }
        Arrays.sort(tsClone);

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(ts[i] == tsClone[j]){
                    res[i] = j + 1;
                    break;
                }
            }
        }

        for(int i = 0; i < n; i++) {
            System.out.print(res[i] + " ");
        }
        
    }
}
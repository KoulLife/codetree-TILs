import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int offset = 100; // 음수 좌표를 양수로 변환하기 위한 offset
        int[] arr = new int[201]; // 범위를 충분히 큰 배열로 설정

        for(int i = 0; i < n; i++) {
            int x1 = sc.nextInt() + offset;
            int x2 = sc.nextInt() + offset;

            // 구간의 시작점과 끝점 사이에 1씩 더해줌
            for(int j = x1; j <= x2; j++) {
                arr[j] += 1;
            }
        }

        int count = 0;

        // 배열에서 값이 2 이상인 구간의 개수 계산
        for(int i = 0; i < 201; i++) {
            if(arr[i] >= 2) {
                count++;
            }
        }

        System.out.println(count);
    }
}
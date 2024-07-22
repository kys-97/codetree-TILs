import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int length = sc.nextInt();

        // 배열 정의
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // 질의 처리
        for (int i = 0; i < length; i++) {
            int q = sc.nextInt();
            if (q == 1) {
                // "1 a" 질의 처리
                int a = sc.nextInt();
                System.out.println(arr[a-1]);
            } else if (q == 2) {
                // "2 b" 질의 처리
                int b = sc.nextInt();
                int index = -1;
                for (int j = 0; j < n; j++) {
                    if (arr[j] == b) {
                        index = j + 1;
                        break; // 첫 번째로 발견된 인덱스에서 멈춤
                    }
                }
                System.out.println(index == -1 ? 0 : index);
            } else if (q == 3) {
                // "3 s e" 질의 처리
                int s = sc.nextInt();
                int e = sc.nextInt();
                for (int j = s - 1; j < e; j++) {
                    System.out.print(arr[j] + " ");
                }
                System.out.println(); // 줄 바꿈
            }
        }

        sc.close();
    }
}
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();

      for (int i = 0; i < n * 2; i++) {
            if (i % 2 == 0) {
                // 짝수 줄에서는 n - i/2 개의 * 출력
                for (int j = 0; j < n - i / 2; j++) {
                    System.out.print("* ");
                }
            } else {
                // 홀수 줄에서는 (i + 1) / 2 개의 * 출력
                for (int j = 0; j < (i + 1) / 2; j++) {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
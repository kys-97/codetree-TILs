import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int k = 0; k < i; k++) {
                System.out.print("  ");
            }
            for (int j = n*2-1; j > i*2; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = 0; i < n-1; i++) {
            for (int k = n-2; k > i; k--) {
                System.out.print("  ");
            }
            for (int j = 0; j < i*2+3; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
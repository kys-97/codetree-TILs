import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 0; i <n; i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for(int i = 1; i <= n-1; i++) { //1 2 3 4
            for (int j = n-1; j >= i; j--) { //j = 4, j > 0
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
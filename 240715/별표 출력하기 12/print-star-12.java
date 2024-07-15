import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        /*
        n = 6
        i == 0
        i / j
          0 1 2 3 4 5
        0 * * * * * *
        1   *   *   *
        2       *   *
        3       *   *
        4           *
        5           *
        */

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                //System.out.print(j+" ");
                if (i == 0 || i == j && i < n-1 || j == n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }
}
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        //행 1 증가 -> 별 2개씩 감소
        /*
        if n = 3
        1:  * * * * *
        2:  0 * * *
        3:  0 0 *

          0  *
        i j  k
        0 0  5
        1 1  3
        2 2  1

        i = 0; i < 3; i++
        j = i; j < i; j++
        k = (n*2)-2; k > 0; k-- 
        */

        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();

        for (int i = 0; i  < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            for (int k = (2*n)-1; k > (2 * i); k--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
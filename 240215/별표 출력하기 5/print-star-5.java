import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        //n의 값 입력 받음
        int n = sc.nextInt();
        //ex: n = 2
        // ** **
        // *
        //ex: n = 3
        // *** *** ***
        // ** **
        // *

       //각 행마다 *을 몇 묶음씩 출력 할 것인지
       for(int i = n; i>=1; i--) {
        //각 행마다 *묶음을 i번 출력하는 역할
        for(int j = 1; j <= i; j++) {
            //k는 *묶음을 출력해주는 역할
            //*묶음은 항상 i개의 *로 이루어져 있음
            for(int k = 1; k<=i; k++) {
                System.out.print("*");
            }
            System.out.print(" ");
        }
        System.out.println();
       }
    }
}
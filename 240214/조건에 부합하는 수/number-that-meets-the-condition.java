import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        //조건 만족 x 수 출력
        for (int i = 1; i<= a; i++) {
            //짝수, 4의 배수 x
            if (i%4!=0 && i%2==0) {
                continue;
            }
            //8로 나눈 몫이 짝수
            if(i/8%2 == 0) {
                continue;
            }
            //7로 나눈 나머지가 4보다 작은
            if(i%7<4) {
                continue;
            }
            //위의 조건에 부합하지 않는 수
            System.out.print(i+" ");
        }
    }
}
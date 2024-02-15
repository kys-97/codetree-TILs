import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        boolean flag = true;

        //a이상 b 이하
        for(int i = a; i<=b; i++) {
            if(i%c==0) {
                //c의 배수가 존재할 경우 false
                flag = false;
            }
        }
        //기본값: 존재하지 않을 경우(true)
        if(flag == true) {
            System.out.println("YES");
        }
        //존재할 경우
        else {
            System.out.println("NO");
        }
    }
}
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        boolean flag = false;

        //a 이상 b 이하에 c의 배수가 없다면 yes
        for(int i = a; i<=b; i++) {
            if(i%c != 0) {
                flag = true;
            }
        }

        if(flag == true) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}
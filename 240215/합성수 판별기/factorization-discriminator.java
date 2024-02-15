import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        boolean flag = false;

        for(int i = 1; i<=n; i++) {
            if(n%i == 0 && n > 1) {
                cnt++;
                if(cnt > 2) {
                    flag = true;
                }
            }
        }

        if(flag == true) {
            System.out.println("C");
        }
        else {
            System.out.println("N");
        }

      
    }
}
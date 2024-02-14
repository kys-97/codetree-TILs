import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        //만들어야 하는 수
        int n = sc.nextInt();
        //x
        int x = 1;
        int cnt = 0;
        while(true) {
            x*=2;
            cnt++;
            if(x == n) {
                break;
            }
        }
        System.out.println(cnt);
        
    }
}
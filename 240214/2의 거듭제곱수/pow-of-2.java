import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        //만들어야 하는 수
        int n = sc.nextInt();
        //
        int x = 1;
        int exp = 2;

        while(true) {
            x++;
            exp *=2;
            if(exp == n) {
                System.out.println(x);
                break;
            }
        }
        
    }
}
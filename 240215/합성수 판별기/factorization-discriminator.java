import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean flag = false;

        for(int i = 0; i<=n; i++) {
             if(i!=1 && i%n == 0 ) {
                flag = true;
             }
             else {
                flag = false;
             }
        }
        if(flag == true) {
            System.out.print("C");
        }
        else {
            System.out.print("N");
        }
    }
}
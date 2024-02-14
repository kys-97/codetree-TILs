import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = n; i<=1000; i++) {
            if(i%1 == 0 && i%2==0 && i%n==0) {
                System.out.println("P");
                break;
            }
            else {
                System.out.println("N");
                break;
            }
        }
    }
}
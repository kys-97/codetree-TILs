import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        //n
        int n = sc.nextInt();
        //sum
        int sum = 0;

        for(int i = 1; i<n; i++) {
            if(n%i == 0) {
                sum += i;
            }
        }

        if(sum == n) {
            System.out.println("P");
        }
        else {
            System.out.println("N");
        }
       
    }
}
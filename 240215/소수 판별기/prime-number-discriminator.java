import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean flag = true;

        for(int i = 2; i< n; i++) {
            if(i%n==0) {
                flag = false;
            }
        }

        if(flag == true) {
            System.out.println("P");
        }
        else {
             System.out.println("C");
        }


    }
}
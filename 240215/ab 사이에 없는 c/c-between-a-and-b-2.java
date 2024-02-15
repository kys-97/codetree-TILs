import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        boolean flag = false;

       //a이상 b이하
       for(int i = a; i<=b; i++) {
        //c의 배수가 없다면 yes
        if(i%c==0) {
            flag = true;
        }
       }

       if(flag = true) {
        System.out.println("NO");
       }
       else {
        System.out.println("YES");
       }
    }
}
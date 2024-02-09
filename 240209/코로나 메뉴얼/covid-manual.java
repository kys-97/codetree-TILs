import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        int b = sc.nextInt();

        if (a.equals("Y")) {
            if (b >= 37) {
                System.out.println("A");
            }
            else {
                System.out.println("C");
            }
        }
        else if (a.equals("N")) {
            if (b >= 37) {
                System.out.println("B");
            }
        }
        else {
            System.out.println("D");
        }
    }
}
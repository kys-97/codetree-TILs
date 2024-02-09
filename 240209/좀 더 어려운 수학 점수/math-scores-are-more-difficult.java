import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int mA = sc.nextInt();
        int eA = sc.nextInt();
        int mB = sc.nextInt();
        int eB = sc.nextInt();

        if (mA < mB) {
            System.out.println("B");
        }
        else if ((mA == mB) && (eA < eB)) {
            System.out.println("B");
        }
        else {
            System.out.println("A");
        }

    }
}
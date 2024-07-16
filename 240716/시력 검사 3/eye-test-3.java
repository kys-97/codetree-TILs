import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        double right = sc.nextDouble();
        double left = sc.nextDouble();

        if (right >= 1.0 && left >= 1.0) {
            System.out.print("H");
        } else if (right >= 0.5 && right < 1.0 && left >= 0.5 && left < 1.0) {
            System.out.print("M");
        } else {
            System.out.print("L");
        }

        sc.close();
    }
}
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String answer = "";
        if (a < 0) {
            answer = "ice";
        }
        else if (a >= 100) {
            answer = "vapor";
        }
        else {
            answer = "water";
        }

        System.out.println(answer);
    }
}
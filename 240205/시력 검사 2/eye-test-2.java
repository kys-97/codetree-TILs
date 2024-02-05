import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        String answer = "";
        if (a >= 1.0) {
            answer = "High";
        }
        else if (a >= 0.5) {
            answer = "Middle";
        }
        else {
            answer = "Low";
        }
        System.out.println(answer);
    }
}
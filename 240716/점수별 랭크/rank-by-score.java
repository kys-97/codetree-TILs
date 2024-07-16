import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();

        if (score >= 90) {
            System.out.println("S");
        } else if (score >= 80 && score < 90) {
            System.out.println("A");
        } else if (score >= 70 && score < 80) {
            System.out.println("B");
        } else if (score >= 60 && score < 70) {
            System.out.println("C");
        } else {
            System.out.println("F");
        }
    }
}
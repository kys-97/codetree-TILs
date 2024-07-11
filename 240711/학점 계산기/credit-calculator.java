import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Double [] score = new Double [n];
        double sum = 0;
        for (int i = 0; i < n; i++) {
            score[i] = sc.nextDouble();
            sum += score[i];
        }

        double avg = sum / n;
        String str = String.format("%.1f", avg);

        if (avg >= 4.0) {
            System.out.println(str);
            System.out.println("Perfect");
        } else if (avg >= 3.0) {
            System.out.println(str);
            System.out.println("Good");
        } else if (avg < 3.0) {
            System.out.println(str);
            System.out.println("Poor");
        }
    }
}
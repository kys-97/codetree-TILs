import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int cm = sc.nextInt();
        int kg = sc.nextInt();

        int bmi = (kg*100*100) / (cm*cm);

        System.out.println(bmi);
        if (bmi >= 25) {
            System.out.println("Obesity");
        }
    }
}
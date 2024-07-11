import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        double [] a = new double [8];
        double sum = 0;
        double avg = 0;
        for(int i = 0; i < 8; i++) {
            a[i] = sc.nextDouble();
            sum += a[i];
        }
        avg = sum /8;
        String str = String.format("%.1f", avg);
        System.out.println(str);
    }
}
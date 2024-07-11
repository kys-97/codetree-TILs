import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int [] a = new int[10];
        for (int i = 0; i < 10; i++) {
            a[i] = sc.nextInt();
        } 

        int sum = 0;
        double cnt = 0;
        double avg = 0;

        for (int i = 0; i < 10; i++) {
            if (a[i] >= 250) {
                break;
            }
            cnt++;
            sum += a[i];
        }
        avg = sum/cnt;
        String str = String.format("%.1f", avg);
        System.out.print(sum+" "+str);

    }
}
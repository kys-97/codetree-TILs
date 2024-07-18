import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int [] arr = new int [10];

        int sum = 0;
        double avg = 0;
        double sum2 = 0;
        double cnt = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            if (i%2 == 1) {
                sum += arr[i];
            } if ((i+1)%3 == 0) {
                cnt++;
                sum2 += arr[i];
            }
        }

        avg = sum2/cnt;
        String str = String.format("%.1f", avg);
        System.out.println(sum+" "+str);

        sc.close();
    }
}
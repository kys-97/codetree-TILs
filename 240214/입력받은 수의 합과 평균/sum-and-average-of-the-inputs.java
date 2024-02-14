import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int [n];
        int sum = 0;
        double avg = 0;

        for(int i = 0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        avg = (double)sum/arr.length;

        System.out.println(sum+" "+String.format("%.1f", avg));

    }
}
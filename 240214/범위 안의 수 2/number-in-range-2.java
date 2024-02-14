import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int [] arr = new int [10];
        int sum = 0;
        int cnt = 0;
        double avg = 0.0;

        for(int i = 0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
            if(arr[i] <=200 && arr[i]>0) {
                sum += arr[i];
                cnt++;
            }
        }
        avg = (double) sum / cnt;

        System.out.print(sum+" "+String.format("%.1f", avg));
    }
}
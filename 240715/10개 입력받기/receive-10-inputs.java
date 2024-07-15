import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int [] score = new int [10];
        int cnt = 0;
        int sum = 0;
        double avg = 0.0;

        //insert number
        for (int i = 0; i < score.length; i++) {
            score[i] = sc.nextInt();
            if (score[i] == 0) {
                break;
            } else {
                cnt++;
            }
        }

        //get sum
        for (int i = 0; i < cnt; i++) {
            sum += score[i];
        }

        //get avg
        avg = sum / cnt;
        String strAvg = String.format("%.1f", avg);
        
        //print
        System.out.println(sum+" "+strAvg);
        sc.close();
    }
}
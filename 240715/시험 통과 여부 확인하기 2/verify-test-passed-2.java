import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        double [] avg = new double [n];
        int [] sum = new int [n];
        int [][] score = new int [n][4];

        for(int i = 0; i < n; i++) {
            for (int j = 0; j < 4; j++) {
                score[i][j] = sc.nextInt();
                sum[i] += score[i][j];
                avg[i] = sum[i]/4;
            }
           if (avg[i] >= 60) {
                cnt++;
                System.out.println("pass");
             } else {
                System.out.println("fail");
            }
        }

        System.out.println(cnt);
        sc.close();
    }
}
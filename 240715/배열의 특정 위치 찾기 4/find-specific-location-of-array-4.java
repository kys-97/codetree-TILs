import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int [] answer = new int [10];
        int cnt = 0;
        int sum = 0;

        for (int i = 0; i < answer.length; i++) {
            answer[i] = sc.nextInt();
            if (answer[i] == 0) {
                break;
            } else {
                if (answer[i] % 2 == 0) {
                    cnt++;
                    sum += answer[i];
                }
            }
        }

        System.out.println(cnt+" "+sum);

        sc.close();
    }
}
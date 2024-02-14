import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        //20대인 사람들 나이의 평균 -> 소수점 둘째자리에서 반올림해 출력
        double avg = 0;
        int sum = 0;
        int age;
        int cnt = 0;

        while(true) {
            age = sc.nextInt();
            if(age/10 != 2) {
                break;
            }
            else {
                sum+=age;
                cnt++;
            }
            avg = (double)sum/cnt;
        }
        
        System.out.printf("%.2f", avg);
        
    }
}
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int cnt1 = 0;
        int cnt2 = 0;
        int cnt3 = 0;

        for(int i = 0; i < n; i++) {
            //주기가 가장 긴 12일부터
            if(i%12 == 0 && i!= 0) {
                cnt3++;
            }
            else if(i%3 == 0 && i!= 0) {
                cnt2++;
            }
            else if(i%2 == 0 && i!= 0){
                cnt1++;
            }
        }

        System.out.print(cnt1+" "+cnt2+" "+cnt3);
    }
}
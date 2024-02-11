import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int [] arr = new int [10];
        int cnt1 = 0;
        int cnt2 = 0;

        for(int i = 0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
            if(arr[i] % 3 == 0) {
                cnt1++;
            }
            if (arr[i]%5 == 0) {
                cnt2++;
            }
        }
        System.out.print(cnt1+" "+cnt2);
    }
}
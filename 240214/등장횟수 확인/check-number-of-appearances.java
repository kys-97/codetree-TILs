import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int [] arr = new int [5];
        int cnt = 0;

        for (int i = 0; i < arr.length; i++) {
            arr [i] = sc.nextInt();

            if (arr[i]%2==0){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
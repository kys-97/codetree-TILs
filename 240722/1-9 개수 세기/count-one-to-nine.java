import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int [n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 1; i < 10; i++) {
            int cnt = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == i) {
                    cnt++;
                }
            }
            System.out.println(cnt);
        }
    }
}
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int [] arr = new int [n];

        int min = 0;
        int max = 0;

        int cnt = 0;

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] > max) {
                max = arr[i];
                
            }
            min = max;
        }

        for(int i = 0; i < n; i++) {
            if (arr[i] < min) {
            min = arr[i];
            }
        }

        for(int i = 0; i < n; i++) {
            if (arr[i] == min) {
                cnt++;
            }
        }

        System.out.println(min+" "+cnt);

        sc.close();
    }
}
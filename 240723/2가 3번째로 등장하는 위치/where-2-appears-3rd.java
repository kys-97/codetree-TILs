import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int [n];
        
        int cnt = 0;
        int save = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] == 2) {
                cnt ++;
                if (cnt == 3) {
                    save = i+1;
                    break;
                }
            }
        }

        System.out.println(save);
        sc.close();

    }
}
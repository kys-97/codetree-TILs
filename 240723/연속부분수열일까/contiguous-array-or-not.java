import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int [] a = new int [n1];
        int [] b = new int [n2];

        int cnt = 0;

        for (int i = 0; i < n1; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < n2; i++) {
            b[i] = sc.nextInt();
        }

        for (int i = 0; i < n1-n2; i++) {
            for (int j = 0; j < n2; j++) {
                if (a[i] == b[j]) {
                   if (a[i+1] == b[j+1]) {
                     System.out.println("Yes");
                   }
                } else {
                    cnt++;
                }
            }
        }

        if (cnt != 0) {
            System.out.println("No");
        }

        sc.close();

    }
}
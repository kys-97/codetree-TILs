import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int[] n = new int[10];

        //insert number
        for (int i = 0; i < 10; i++) {
            if (sc.hasNextInt()) {
                n[i] = sc.nextInt();
            } else {
                break;
            }
        }

        //print number
        int cnt = 0;
        for (int i = 0; i < n.length; i++) {
            if (n[i] == 0) {
                break;
            } if (n[i] != 0) {
                cnt++;
            }
        }

        for (int i = cnt-1; i >= 0; i--) {
            System.out.print(n[i]+" ");
        }
        
        sc.close();
    }
}
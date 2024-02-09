import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String [] str = new String [3];
        int [] n = new int [3];
        int cnt = 0;

        for (int i = 0; i < n.length; i++) {
            str[i] = sc.next();
            n[i] = sc.nextInt();
        }

        for (int i = 0; i < str.length; i++) {
            if (str[i].equals("Y")) {
                if (n[i] >= 37) {
                    cnt ++;
                }
            }
        }

        if (cnt >= 2) {
            System.out.println("E");
        }
        else {
            System.out.println("N");
        }

    }
}
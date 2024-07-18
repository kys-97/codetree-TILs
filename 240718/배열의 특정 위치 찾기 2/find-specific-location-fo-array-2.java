import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int even = 0;
        int odd = 0;
        int [] arr = new int [10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            if (i%2 != 0) {
                even += arr[i];
            } else if (i%2 == 0) {
                odd += arr[i];
            }
        }

        if (even > odd) {
            System.out.println(even - odd);
        } else {
            System.out.println(odd - even);
        }

        sc.close();
    }
}
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter(".");
        int yyyy = sc.nextInt();
        int mm = sc.nextInt();
        int dd = sc.nextInt();
        String dash = "-";
        System.out.println(mm+dash+dd+dash+yyyy);
    }
}
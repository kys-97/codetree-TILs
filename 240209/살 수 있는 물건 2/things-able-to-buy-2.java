import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n >= 3000) {
            System.out.println("book");
        }
        else if (n >= 1000 && n < 3000) {
            System.out.println("mask");
        }
        else if (n >=500 && n < 1000) {
            System.out.println("pen");
        }
        else {
            System.out.println("no");
        }
    }
}
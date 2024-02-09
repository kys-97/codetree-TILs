import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        if ((month > 2) && (month < 6)) {
            System.out.println("Spring");
        }
        else if ((month > 5) && (month < 9)) {
            System.out.println("Summer");
        }
        else if ((month > 8) && (month < 12)){
            System.out.println("Fall");
        }
        else {
            System.out.println("Winter");
        }
    }
}
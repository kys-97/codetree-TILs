import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        int a1 = sc.nextInt();

        String b = sc.next();
        int b1 = sc.nextInt();

        String c = sc.next();
        int c1 = sc.nextInt();

        if (((a.equals("Y"))&&(b.equals("Y")))||((a.equals("Y"))&&(c.equals("Y")))||((b.equals("Y"))&&(c.equals("Y")))) {
            if ((a1>=37)&&(b1>=37)) {
                System.out.println("E");
            }
            if (((b1>=37)&&(c1>=37))) {
                System.out.println("E");
            }
            if (((a1>=37)&&(c1>=37))) {
                System.out.println("E");
            }
            if (((a1 >= 37)&&(b1>=37)&&(c1>=37))) {
                System.out.println("E");
            }
        }
        else {
            System.out.println("N");
        }
    }
}
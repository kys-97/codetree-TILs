import java.util.*;
public class Main {
    public static void main(String[] args) {
        //scanner
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = 0;

        while(true) {
            a/=b;
            if (a <= 1) {
                break;
            } else if (a > 1) {
                result = (a%b)*(a%b);
            }
        }
        System.out.println(result);
        sc.close();
    }
}
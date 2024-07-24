import java.util.*;
public class Main {

    public static void printM(int n, int m) {
    int min = 0;
    if (n > m) {
        min = m;
    } else {
        min = n;
    }

    int max = 0;

    for (int i = 1; i <= min; i++) {
        if (n%i == 0 && m%i==0) {
            if (i > max) {
                max = i;
            }
        }
    }

     System.out.println(max);

    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        printM(n,m);
    }
}
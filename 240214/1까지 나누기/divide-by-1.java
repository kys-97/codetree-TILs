import java.util.*;
public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       //n
       int n = sc.nextInt();
       //cnt
       int cnt = 0;
       //n 값 저장
       double d = n;
       //int i = 1; i<=n; i++
       for(int i = 1; i<=n; i++) {
        d/=(double)i;
        cnt++;
        if(d<=1) {
            break;
        }
       }
       System.out.print(cnt);
    }
}
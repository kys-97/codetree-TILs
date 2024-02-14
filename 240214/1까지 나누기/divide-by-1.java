import java.util.*;
public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       //n
       int n = sc.nextInt();
       //cnt
       int cnt = 0;
       //n 값 저장
       int d = n;
       //int i = 1; i<=n; i++
       //1부터 순서대로 나눔 -> d의 값이 1 이하가 되는 순간까지 나눗셈 진행 (break: if d<=1)
       for(int i = 1; i<=n; i++) {
        d/=i;
       cnt++;
      // System.out.print(i);
       //System.out.println(d);
       if(d<=1) {
        System.out.println(cnt);
        break;
       }
       
       }
       
    }
}
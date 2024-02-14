import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;

        while(true) {
            cnt++;
            if(n%2==0) {
                n = n*3+1;
            }
            else if(n%2!=0) {
                n= n*2+2;
            }
            if(n>=1000) {
                break;
            }
            
        }
        System.out.println(cnt);
    }
}
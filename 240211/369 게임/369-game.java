import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result1 = 0;
        int result2 =0;
		for(int i = 1; i <= n; i++) {
			result1 = i%10;
            result2 = i/10;
			if (i%3 ==0 || result1 % 3 == 0 && result2 % 3 == 0) {
				System.out.print(0+" ");
			}
			else {
				System.out.print(i+" ");
			}
		}
    }
}
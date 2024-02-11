import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = 0;
		for(int i = 1; i <= n; i++) {
			result = i%10;
			if (i%3 ==0 || result % 3 == 0) {
				System.out.print(0+" ");
			}
			else {
				System.out.print(i+" ");
			}
		}
    }
}
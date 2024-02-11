import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();

        for (int i = score; i<=100; i++) {
			if (i < 60) {
				System.out.print("F ");
			}
			else if (i >=60 && i<70) {
				System.out.print("D ");
			}
			else if (i>=70 && i<80) {
				System.out.print("C ");
			}
			else if(i>=80 && i< 90) {
				System.out.print("B ");
			}
			else {
				System.out.print("A ");
			}
		}
    }
}
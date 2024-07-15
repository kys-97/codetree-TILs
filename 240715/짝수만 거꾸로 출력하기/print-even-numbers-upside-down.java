import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] answer = new int [n];
        

        for(int i = 0; i < answer.length; i++) {
            answer[i] = sc.nextInt();
        }

        for (int i = n-1; i >= 0; i--) {
            if (answer[i] % 2 == 0) {
                System.out.print(answer[i]+" ");
            }
        }

        sc.close();

        
    }
}
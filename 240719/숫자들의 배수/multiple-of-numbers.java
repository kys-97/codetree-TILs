import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int [10];
        int cnt = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = n*(i+1);
            if (arr[i]%5==0) {
                cnt ++;
            }
            System.out.print(arr[i]+" ");
             if (cnt == 2) {
                 break;
            }
        }
    }
}
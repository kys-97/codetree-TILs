import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int [n];

        for(int i = 0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
            if (arr[i]%2!=0 && arr[i]%3==0) {
                System.out.println(arr[i]);
            }
        }
    }
}
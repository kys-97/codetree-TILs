import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int [] arr = new int [100];
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            if(sc.hasNextInt()) {
                arr[i] = sc.nextInt();
            } if (arr[i] == 0) {
                sum += (arr[i-3]+arr[i-2]+arr[i-1]);
                break;
            }
            
        }
        System.out.println(sum);
    }
}
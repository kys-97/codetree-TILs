import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int i = 0;
        int [] arr = new int [100];
        
        while (sc.hasNextInt()) {
            arr[i] = sc.nextInt();
            if (arr[i] != 0) {
                if (arr[i]%2 == 1) {
                    arr[i] = arr[i]+3;
                } else if (arr[i]%2 == 0) {
                    arr[i] = arr[i]/2;
                }
                System.out.print(arr[i]+" ");
            }
        }

        sc.close();
    }
}
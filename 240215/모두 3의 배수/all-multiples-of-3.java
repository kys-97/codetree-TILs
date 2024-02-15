import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int [] arr = new int [5];
        boolean flag = true;

        for(int i = 0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
            if(arr[i]%3 != 0) {
                flag = false;
            }
        }

        if(flag == false) {
            System.out.println(0);
        }
        else {
            System.out.println(1);
        }
    }
}
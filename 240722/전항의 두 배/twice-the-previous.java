import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        //scanner
        Scanner sc = new Scanner(System.in);
        //index 0, 1
        int a = sc.nextInt();
        int b = sc.nextInt();
        //arr
        int [] arr = new int [10];
        arr[0] = a;
        arr[1] = b;

        for (int i = 0; i < arr.length-2; i++) {
            arr[i+2] = arr[i+1] + (2*arr[i]);
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

        sc.close();
    }
}
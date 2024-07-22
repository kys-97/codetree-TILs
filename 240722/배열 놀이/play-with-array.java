import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int length = sc.nextInt();
        HashMap <Integer, Integer> hMap = new HashMap<>();
        //array
        int [] arr = new int [n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < length; i++) {
            int q = sc.nextInt();
            if (q == 1) {
                int a = sc.nextInt();
                System.out.println(arr[a-1]);
            } else if (q == 2) {
                int b = sc.nextInt();
                for (int j = 0; j < arr.length; j++) {
                    if (arr[j] == b) {
                        System.out.println(j+1);
                    }
                }
            } else {
                int a = sc.nextInt();
                int b = sc.nextInt();
                for (int j = 0; j < arr.length; j++) {
                    System.out.println(arr[a-1]+" "+arr[b-1]);
                    break;
                    }
                }            
            }

            sc.close();
    }
}
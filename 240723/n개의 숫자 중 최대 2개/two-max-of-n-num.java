import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int [n];

        //기존 배열 입력
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        //내림차순 정렬
        for(int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-1-i; j++) {
                if (arr[j] < arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        //출력
        for(int i = 0; i < 2; i++) {
            System.out.print(arr[i]+" ");
        }

        sc.close();

    }
}
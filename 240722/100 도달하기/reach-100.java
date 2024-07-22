import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        //scanner
        Scanner sc = new Scanner(System.in);
        //n -> second index value
        int n = sc.nextInt();
        //arr
        ArrayList <Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(n);
        int cnt = 2;

        while (true) {
            int value = arr.get(cnt-2)+arr.get(cnt-1);
            arr.add(value);
            cnt++;
            if (value > 100) {
                break;
            }
        }

        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i)+" ");
        }

        sc.close();
    }
}
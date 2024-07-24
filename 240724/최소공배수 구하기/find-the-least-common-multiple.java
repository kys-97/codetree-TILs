import java.util.*;
public class Main {

    public static void printM(int n, int m) {
        int answer = 0;
        int cnt = 0;
        int min = 0;
        ArrayList <Integer> arr = new ArrayList<>();
        if (n > m) {
            min = m;
        } else {
            min = n;
        }

        for (int i = 1; i<=min; i++) {
            for(int j = 1; j <=i; j++) {
                if (n*i == m*j) {
                    arr.add(n*i);
                }
            }
        }

        System.out.print(arr.get(0));
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        printM(n,m);
        sc.close();
    }
}
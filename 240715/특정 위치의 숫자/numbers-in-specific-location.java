import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = 10;
        List<Integer> nList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            nList.add(sc.nextInt());
        }
        int sum = 0;
        sum += nList.get(2);
        sum += nList.get(4);
        sum += nList.get(9);
        System.out.println(sum);
    }
}
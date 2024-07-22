import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        ArrayList <Integer> arr = new ArrayList<>();

        while(sc.hasNext()) {
            arr.add(sc.nextInt());
        }

        for (int i = 1; i < 10; i++) {
            int cnt = 0;
            for (int j = 0; j < arr.size(); j++) {
                if (arr.get(j)/10 == i) {
                    cnt++;
                }
            }
            System.out.println(i+" - "+cnt);
        }

        sc.close();
    }
}
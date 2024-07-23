import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        ArrayList <Integer> arr = new ArrayList<>();
        int max = 0;
        int min = 0;

        while(sc.hasNext()) {
            arr.add(sc.nextInt());
        }

        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) >= 999) {
                arr.remove(i);
            } else if (arr.get(i) <= -999) {
                arr.remove(i);
            }
        }

        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) < min) {
                min = arr.get(i);
            } else if (arr.get(i) > max) {
                max = arr.get(i);
            }
        }

        System.out.println(max+" "+min);

        sc.close();
    }
}
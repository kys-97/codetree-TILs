import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        int result = 0;
        
        while (a > 0) {
            int remainder = a % b;
            arr.add(remainder);
            a /= b;
            if (a <= 1) {
                break;
            }
        }

        // map to store the count of remainders
        HashMap<Integer, Integer> hMap = new HashMap<>();
        
        // count the occurrences of each remainder
        for (int value : arr) {
            hMap.put(value, hMap.getOrDefault(value, 0) + 1);
        }

        // calculate the sum of squares of the counts
        for (Map.Entry<Integer, Integer> entry : hMap.entrySet()) {
            result += (entry.getValue() * entry.getValue());
        }

        System.out.println(result);
        sc.close();
    }
}
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String [] str = new String [10];
        for (int i = 0; i < str.length; i++) {
            if(sc.hasNext()) {
                str[i] = sc.next();
            } if (i == 1 || i == 4 || i == 7) {
                System.out.print(str[i]+" ");
            }
        }
        
        sc.close();
    }
}
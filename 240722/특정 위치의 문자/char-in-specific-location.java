import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        //char array
        char [] charData = {'L', 'E', 'B', 'R', 'O', 'S'};
        //read text
        char c = sc.next().charAt(0);
        
        for (int i = 0; i < charData.length; i++) {
            if (charData[i] == c) {
                System.out.print(i);
                break;
            }
        }

        if (!charData.contains(c)) {
            System.out.print("None");
        }


        sc.close();
    }
}
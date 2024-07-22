import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        //char array
        char [] charData = {'L', 'E', 'B', 'R', 'O', 'S'};
        //read text
        char c = sc.next().charAt(0);
        //boolean
        boolean flag = false;
        //result
        int result = 0;
        
        for (int i = 0; i < charData.length; i++) {
            if (charData[i] == c) {
                flag = true;
                result = i;
            } else {

            }
        }

        if (flag = true) {
            System.out.print(result);
        } else {
            System.out.print("None");
        }


        sc.close();
    }
}
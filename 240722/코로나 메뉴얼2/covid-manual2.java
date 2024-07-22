import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //char
        char [] charData = new char [3];
        //int
        int [] intData = new int [3];
        //result
        int [] result = new int [4];

            int a = 0;
            int b = 0;
            int c = 0;
            int d = 0;

        //for
        for (int i = 0; i < 3; i++) {
            String str = sc.nextLine();
            String [] strData = str.split(" ");
            charData[i] = strData[0].charAt(0);
            intData[i] = Integer.parseInt(strData[1]);

            if(charData[i] == 'Y' && intData[i] >= 37) {
                a++;
            } else if (charData[i] == 'N' && intData[i] >= 37) {
                b++;
            } else if (charData[i] == 'Y' && intData[i] < 37) {
                c++;
            } else if(charData[i] == 'N' && intData[i] < 37) {
                d++;
            }
        }

        result[0] = a;
        result[1] = b;
        result[2] = c;
        result[3] = d;

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]+" ");
        }
        if (a >= 2) {
            System.out.print("E");
        }
        
        sc.close();
    }
}
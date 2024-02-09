import java.util.*;
public class Main {
    public static void main(String[] args) {
        // n 입력 받기
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        //if else if else
        if(n >= 3000) {
            System.out.println("book");
        }
        else if (n >= 1000 && n < 3000) {
            System.out.println("mask");
        }
        else {
            System.out.println("no");
        }
    }
}
package Baekjoon;
import java.util.*;
public class Step_5_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCase = scanner.nextInt();

        for(int i=0; i<testCase; i++){
            String input = scanner.next();
            String[] list = input.split("");
            System.out.println(list[0]+list[list.length-1]);
        }
    }
}

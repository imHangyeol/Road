package Baekjoon;
import java.util.*;
public class Step_5_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String input = sc.next();

        int sum = 0;

        for (int i = 0; i < num; i++)
            sum += input.charAt(i) - '0';
        System.out.println(sum);
    }
}
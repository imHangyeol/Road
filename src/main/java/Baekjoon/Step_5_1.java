package Baekjoon;
import java.util.*;
public class Step_5_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int num = scanner.nextInt();

        String[] list = input.split("");
        System.out.println(list[num-1]);
    }
}

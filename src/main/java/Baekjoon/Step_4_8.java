package Baekjoon;
import java.util.*;
public class Step_4_8 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int[] list = new int[10];
        int[] resultList = new int[10];
        int x = 42;
        int count = 1;

        for (int a = 0; a < 10; a++) {
            int number = scanner.nextInt();
            list[a] = number;
        }

        for (int b = 0; b<10; b++){
            resultList[b] = list[b] % x;
        }
        resultList = Arrays.stream(resultList).distinct().toArray();
        System.out.println(resultList.length);
    }
}

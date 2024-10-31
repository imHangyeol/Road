package Baekjoon;
import java.util.*;
public class Step_4_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int boxNum = scanner.nextInt();
        int[] list = new int[boxNum];
        int throwBall = scanner.nextInt();
        for (int i = 0; i < throwBall; i++) {
            int firstBox = scanner.nextInt();
            int lastBox = scanner.nextInt();
            int ballNum = scanner.nextInt();

            if (firstBox == lastBox) {
                list[firstBox-1] = ballNum;
            } else
            {
                for (int j = firstBox-1; j <= lastBox - 1; j++) {
                    list[j] = ballNum;
                }
            }
        }
        for(int a:list)
            System.out.print(a+" ");;
    }
}

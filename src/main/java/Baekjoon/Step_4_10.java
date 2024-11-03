package Baekjoon;
import java.util.*;
public class Step_4_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int examNum = scanner.nextInt();
        double[] list = new double[examNum];
        double sum = 0;
        double avg = 0;

        for (int i = 0; i < examNum; i++) {
            int score = scanner.nextInt();
            list[i] = score;
        }
        Arrays.sort(list);
        double maxScore = list[list.length - 1];

        for (int j = 0; j < list.length; j++) {
            list[j] = (list[j] * 100) / maxScore;
        }

        for(int k = 0; k<list.length; k++){
            sum += list[k];
        }
        avg = sum/list.length;
        System.out.println(avg);
    }
}

package Baekjoon;
import java.util.*;
public class Step_4_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(9);

        for(int i=0; i<9; i++) {
            int pushNum = scanner.nextInt();
            list.add(pushNum);
        }
        int max = Collections.max(list);
        System.out.println(max);
        System.out.println(list.indexOf(max)+1);
    }
}

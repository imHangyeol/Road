package Baekjoon;

import java.util.*;
public class Step_4_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        ArrayList<Integer> list = new ArrayList<>(size);

        for(int i=0; i<size; i++) {
            int pushNum = scanner.nextInt();
            list.add(pushNum);
        }

        list.sort(Comparator.naturalOrder());
        System.out.print(list.get(0)+" "+list.get(size-1));
    }
}

package Baekjoon;

import java.util.Scanner;

public class Step_4_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int boxNum = scanner.nextInt();
        int[] list = new int[boxNum];
        for(int i=1;i<=boxNum; i++){
            list[i-1] = i;
        }

        int swap = scanner.nextInt();
        for(int j=0; j<swap; j++){
            int temp1 = scanner.nextInt();
            int temp2 = scanner.nextInt();

            int temp;
            temp = list[temp1-1];
            list[temp1-1] = list[temp2-1];
            list[temp2-1] = temp;
        }
        for(int a:list)
            System.out.print(a+" ");
    }
}

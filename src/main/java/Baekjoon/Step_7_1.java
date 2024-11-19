package Baekjoon;
import java.util.*;
public class Step_7_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int low = sc.nextInt();
        int attribute = sc.nextInt();
        int[][] arr = new int[low][attribute];
        int[][] arr2 = new int[low][attribute];

        for(int i = 0; i<low; i++)
            for (int j = 0; j<attribute; j++) {
                int input = sc.nextInt();
                arr[i][j] = input;
            }

        for(int i = 0; i<low; i++)
            for (int j = 0; j<attribute; j++) {
                int input = sc.nextInt();
                arr2[i][j] = input;
            }

        for(int i = 0; i<low; i++)
            for (int j = 0; j<attribute; j++) {
                arr[i][j] = arr[i][j] + arr2[i][j];
            }

        for (int i = 0; i < arr.length; i++) {
            int[] inArr = arr[i];
            for (int j = 0; j < inArr.length; j++) {
                System.out.print(inArr[j] + " ");
            }            System.out.println();
        }
    }
}


package Baekjoon;
import java.util.*;
public class Step_6_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];
        int[] arrNum = {1, 1, 2, 2, 2, 8};

        for (int i=0; i<arr.length; i++) {
            int input = sc.nextInt();
            arr[i] = input;
            arr[i] = arrNum[i] - arr[i];
        }

        for (int a:arr)
            System.out.print(a+" ");
    }
}

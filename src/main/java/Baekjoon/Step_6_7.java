package Baekjoon;
import java.util.*;
public class Step_6_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        int count = 0;

        for (int i = 0; i < testCase; i++) {
            String input = sc.next();
            boolean A = true;
            char[] arr = new char[input.length()];
            int[] list = new int[26];
            for (int a = 0; a < input.length(); a++)
                arr[a] = input.charAt(a);

            for (int j = 0; j < arr.length; j++) {
                if (j == arr.length - 1){
                    int index = arr[j] -97;
                    list[index]++;
                }
                else if (arr[j] == arr[j + 1]) {
                } else if (arr[j] != arr[j + 1]) {
                    int index = arr[j] - 97;
                    list[index]++;
                }
            }
            for (int a : list) {
                if (a <= 1){}
                else
                    A=false;
            }
            if (A==true)
                count++;
        }
        System.out.println(count);
    }
}
package Baekjoon;
import java.util.*;
public class Step_5_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        char[] arr = new char[input.length()];
        int sum = 0;

        for (int i = 0; i < input.length(); i++)
            arr[i] = input.charAt(i);

        for (int j = 0; j < input.length(); j++) {
            if (arr[j] == 'A'|| arr[j] == 'B'||arr[j] == 'C')
                sum += 3;
              else if (arr[j] == 'D'|| arr[j] == 'E'|| arr[j] == 'F') {
                sum += 4;
            } else if (arr[j] == 'G'|| arr[j] == 'H'|| arr[j] == 'I') {
                sum += 5;
            } else if (arr[j] == 'J'|| arr[j] == 'K'|| arr[j] == 'L') {
                sum += 6;
            } else if (arr[j] == 'M'|| arr[j] == 'N'|| arr[j] == 'O') {
                sum += 7;
            } else if (arr[j] == 'P'|| arr[j] == 'Q'|| arr[j] == 'R' || arr[j] =='S') {
                sum += 8;
            } else if (arr[j] == 'T'|| arr[j] == 'U'|| arr[j] == 'V') {
                sum += 9;
            } else
                sum += 10;
        }
        System.out.println(sum);
    }
}

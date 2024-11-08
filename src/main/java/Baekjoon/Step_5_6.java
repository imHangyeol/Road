package Baekjoon;
import java.util.*;
public class Step_5_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        char[] list = new char[input.length()];
        int[] list2 = new int[26];
        for(int i=0; i<list2.length; i++)
            list2[i] = -1;

        for(int j=0; j<input.length(); j++)
            list[j] = input.charAt(j);

        for(int a=97; a<123; a++){
            for(int b=0; b< list.length; b++){
                if((char)a == list[b]) {
                    list2[a - 97] = b;
                    break;
                }
            }
        }
        for(int a: list2)
            System.out.print(a+" ");
    }
}

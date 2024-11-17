package Baekjoon;
import java.util.*;
public class Step_6_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        char[] list = new char[input.length()];
        int end = 1;

        for(int a=0; a<input.length(); a++)
            list[a] = input.charAt(a);

        for(int first=0; first<input.length()/2; first++) {
            if (list[0 + first] == list[input.length() - end]){
                end++;
                if(first == (input.length()/2 - 1))
                    System.out.print("1");
            }
            else{
                System.out.print("0");
                break;
            }
        }
        if (input.length()==1)
            System.out.print("1");
    }
}

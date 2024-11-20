package Baekjoon;
import java.util.*;

public class Step_6_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        char[] list = new char[input.length()];
        int count = 0;

        for(int i=0; i<input.length(); i++)
            list[i] = input.charAt(i);

        for(int j=0; j< list.length; ){
            if(j != list.length-1 && list[j]=='c' && list[j+1]=='='){
                count++;
                j += 2;
            }
            else if(j != list.length-1 && list[j]=='c' && list[j+1]=='-') {
                count++;
                j += 2;
            }
            else if(j != list.length-1 && j != list.length-2 && list[j]=='d' && list[j+1]=='z' && list[j+2]=='=') {
                count++;
                j += 3;
            }
            else if(j != list.length-1 && list[j]=='d' && list[j+1]=='-') {
                count++;
                j += 2;
            }
            else if(j != list.length-1 && list[j]=='l' && list[j+1]=='j') {
                count++;
                j += 2;
            }
            else if(j != list.length-1 && list[j]=='n' && list[j+1]=='j') {
                count++;
                j += 2;
            }
            else if(j != list.length-1 && list[j]=='s' && list[j+1]=='=') {
                count++;
                j += 2;
            }
            else if(j != list.length-1 && list[j]=='z' && list[j+1]=='=') {
                count++;
                j += 2;
            }
            else {
                count++;
                j++;
            }
        }
        System.out.print(count);
    }
}

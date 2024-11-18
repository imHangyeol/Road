package Baekjoon;
import java.util.*;
public class Step_6_5 {
    public static void main(String[] args) {
        int[] alphabet = new int[26];
        int t = 0;

        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        char[] list = new char[word.length()];

        for(int a=0; a<word.length(); a++)
            list[a] = word.charAt(a);

        for(int b=0; b<list.length; b++){
            if(list[b]>=97)
                t = list[b]-97;
            else
                t = list[b]-65;
            alphabet[t]++;
        }

        int max = 0;
        int index = 0;
        int maxIndex = 0;
        int count = 0;

        for(int i=0; i<26; i++, index++){
            if(alphabet[i] > max) {
                max = alphabet[i];
                maxIndex = index + 65;
            }
        }

        for(int j=0; j<26; j++){
            if(alphabet[j]==max)
                count++;
        }

        if(count>=2)
            System.out.print("?");
        else
            System.out.print((char)maxIndex);
    }
}

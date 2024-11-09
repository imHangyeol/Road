package Baekjoon;
import java.util.*;
public class Step_5_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();

        for(int i=0; i<testCase; i++){
            int repeatNum = sc.nextInt();
            if(repeatNum<1 || repeatNum>8)
                System.out.println(" ");
            else{
                String word = sc.next();
                String[] list = word.split("");
                for(int j=0; j<list.length; j++) {
                    for (int k = 0; k < repeatNum; k++)
                        System.out.print(list[j]);
                }
            }
            System.out.println();
        }
    }
}

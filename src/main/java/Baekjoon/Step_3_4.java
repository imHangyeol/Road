package Baekjoon;

import java.util.*;

public class Step_3_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = sc.nextInt();
        int num = sc.nextInt();
        int sum1 = 0;
        int total = 0;

        for(int i=1; i <= num; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            sum1 = a*b;
            total += sum1;
        }


        if(sum==total){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}
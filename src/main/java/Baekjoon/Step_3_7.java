package Baekjoon;

import java.util.*;


public class Step_3_7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1; i<=n ; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println("Case #"+i+": "+(a+b));
        }
    }
}
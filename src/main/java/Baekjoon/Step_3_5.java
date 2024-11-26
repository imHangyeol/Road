package Baekjoon;

import java.util.*;

public class Step_3_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int l = n/4;
        String a ="";
        for(int i=1; i<=l; i++){
            a += "long ";
        }

        System.out.println(a + "int");
    }
}

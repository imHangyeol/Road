package Baekjoon;
import java.util.*;
public class Step_6_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int z = x;
        int t = 0;

        for (int y=0; y<x; y++, z--, t+=2){
            for(int a=0; a<z-1; a++)
                System.out.print(" ");
            for (int b=0; b<=t; b++) {
                System.out.print("*");
            }
            System.out.println();
        }
        int p = t-4;

        for (int y=0; y<x-1; y++, p-=2){
            for(int a=0; a<=y; a++)
                System.out.print(" ");
            for(int b=0; b<=p; b++)
                System.out.print("*");
            System.out.println();
        }
    }
}


package Baekjoon;
import java.util.*;

public class Step_3_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        for(int i = 1; i < 10; i++){
            System.out.println(a +" * "+ i +" = "+ a*i);
        }
    }
}
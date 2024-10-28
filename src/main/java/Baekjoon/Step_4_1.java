package Baekjoon;
import java.util.*;

public class Step_4_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] b = new int[num];
        for(int i=0; i<num; i++){
            int element = sc.nextInt();
            b[i] = element;
        }
        int find_num = sc.nextInt();
        int sum = 0;
        for(int j: b){
            if(j==find_num){
                sum += 1;
            }
        }
        System.out.println(sum);
    }
}

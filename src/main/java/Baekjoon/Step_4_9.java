package Baekjoon;
import java.util.*;
public class Step_4_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] list = new int[size];

        for(int a=0; a<size; a++){
            list[a] = a+1;
        }
        int swap = scanner.nextInt();

        for(int i=0; i<swap; i++){
            int firstBox = scanner.nextInt();
            int lastBox = scanner.nextInt();
            int t = firstBox-1;
            for(int j=lastBox-1; j>t;j--,t++){
                if(t>=j)
                    break;
                int temp;
                temp = list[j];
                list[j] = list[t];
                list[t] = temp;
            }
        }
        for(int x:list){
            System.out.print(x+" ");
        }
    }
}

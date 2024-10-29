package Baekjoon;
import java.util.*;
public class Step_4_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        ArrayList<Integer> list = new ArrayList<>(size);

        int key = scanner.nextInt();
        for(int i=0; i<size;i++) {
            int push_num = scanner.nextInt();
            list.add(push_num);
        }
        for(int j:list){
            if(j<key) {
                System.out.print(j + " ");
            }
        }
    }
}

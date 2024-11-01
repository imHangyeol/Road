package Baekjoon;

import java.util.*;

public class Step_4_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(28);

        for(int a=0; a<28;a++) {
            int num = scanner.nextInt();
            list.add(num);
        }

        for(int j=1; j<31; j++){
            if(list.contains(j)==false){
                System.out.println(j);
            }
        }
    }
}


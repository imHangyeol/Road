package Baekjoon;
import java.util.*;
public class Step_5_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input1 = sc.next();
        String input2 = sc.next();

        int[] list1 = new int[3];
        int temp;

        for(int i=0; i<3; i++)
            list1[i] = (int)input1.charAt(i)-'0';

        for(int j=0; j<1; j++){
            temp = list1[2];
            list1[2] = list1[0];
            list1[0] = temp;
        }

        int[] list2 = new int[3];

        for(int a=0; a<3; a++)
            list2[a] = (int)input2.charAt(a)-'0';

        for(int b=0; b<1; b++){
            temp = list2[2];
            list2[2] = list2[0];
            list2[0] = temp;
        }

        for(int x=0; x<3; x++){
            if(list1[x]>list2[x]) {
                for (int a : list1)
                    System.out.print(a);
                    break;
            }
            else if (list1[x]==list2[x]){}

            else
            {
                for (int a : list2)
                    System.out.print(a);
                    break;
            }

        }
    }
}

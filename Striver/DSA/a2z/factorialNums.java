package Striver.DSA.a2z;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class factorialNums {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=1;i<=a;i++){
            int s=0;
            int s1=0;
            for(int j=1;j<=i;j++){
                s+=j;
                s1=j;
            }
            if(a>i && a>=s){
                arr.add(i);
            }
            else if(a>=s){
                arr.add(s);
            }

        }
        System.out.println(arr);


    }
}

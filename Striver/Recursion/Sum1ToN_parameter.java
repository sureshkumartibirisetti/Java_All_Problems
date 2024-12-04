package Striver.Recursion;

import java.util.Scanner;

public class Sum1ToN_parameter {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        func(a,0);
    }
    static void func(int i,int a){
        if(i<1){
            System.out.print(a);
            return;
        }
        func(i-1,a-i);

    }
}

package Striver.Recursion;

import java.util.Scanner;

public class printNTo1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        func(a,a);
    }
    static void func(int i,int n){
        if(i==0){
            return;
        }

        func(i-1,n);
        System.out.print(i+" ");
    }
}

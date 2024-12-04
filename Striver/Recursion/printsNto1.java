package Striver.Recursion;

import java.util.Scanner;

public class printsNto1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        func(a);
    }
    static void func(int n){
        if(n==0){
            return ;
        }
        System.out.print(n+" ");
        func(n-1);
    }
}

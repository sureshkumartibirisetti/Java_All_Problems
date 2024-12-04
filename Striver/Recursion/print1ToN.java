package Striver.Recursion;

import java.util.Scanner;

public class print1ToN {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        func(a);
    }
    static void func(int n){
        if(n==0){
            return;
        }
        func(n-1);
        System.out.print(n+" ");
    }
}

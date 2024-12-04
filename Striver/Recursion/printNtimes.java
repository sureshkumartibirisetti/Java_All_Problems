package Striver.Recursion;

import java.util.Scanner;

public class printNtimes {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        printNtimes obj=new printNtimes();
        int a=in.nextInt();
        obj.func(1,a);
    }
    void func(int i,int n){
        if(i>n){
            return ;
        }

        func(i+1,n);
        System.out.println("Mr.suresh");
    }
}

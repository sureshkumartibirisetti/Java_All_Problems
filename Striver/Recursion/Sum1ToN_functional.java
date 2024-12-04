package Striver.Recursion;

import java.util.Scanner;

public class Sum1ToN_functional {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        System.out.println(func(a));
    }
    static int func(int n){
        if(n==0){
            return 0;
        }
        return n+func(n-1);

    }
}

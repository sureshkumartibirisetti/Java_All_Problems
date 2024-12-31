package Hyrtutorials.practice;

import java.util.Scanner;

//0 1 1 2 3 5 8 13 21 34 55
//4 6 7 9 10
public class rough10 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int num=in.nextInt();
        int a=0;
        int b=1;
        for(int i=3;i<=num;i++){
            int c=a+b;
            a=b;
            b=c;
        }

    }
}

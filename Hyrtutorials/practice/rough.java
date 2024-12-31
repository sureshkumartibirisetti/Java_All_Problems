package Hyrtutorials.practice;

import java.util.Scanner;

//num=11
//
public class rough {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        if(n%2==0){
            System.out.println("0");
        }else{
            System.out.println((n-1)/2);
        }
    }
}

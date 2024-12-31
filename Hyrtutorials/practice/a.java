package Hyrtutorials.practice;

import java.util.Scanner;

public class a {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        if(((a/2)*2)==a) {
            System.out.println("Even");
        }else{
            System.out.println("odd");
        }
        System.out.println(a/2);
    }
}

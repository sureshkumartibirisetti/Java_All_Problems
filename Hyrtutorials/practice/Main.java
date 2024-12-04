package Hyrtutorials.practice;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        if (a <= 2 || b <= 2 || b < a) {
            System.out.println("Invalid Input");
            System.out.println("you must Enter the inputs more than 2");
        } else {
            for (int i = a; i <= b; i++) {
                prime(i);
            }
        }
    }



        static void prime(int a){
        int p=0;
        for(int i=2;i<=Math.sqrt(a);i++){
            if(a%i==0){
                p++;
            }
        }
        if(p==0){
            System.out.print(a+" ");
        }
    }
    }

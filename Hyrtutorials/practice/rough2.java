package Hyrtutorials.practice;

import java.util.Scanner;

public class rough2 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter a value : ");
        int a=in.nextInt();
        System.out.print("Enter b value : ");
        int b=in.nextInt();
        System.out.println("Enter the Operator(+,-,%,*,/):");
        char o=in.next().charAt(0);
        switch (o){
            case '+':
                System.out.println(a+b);
                break;
            case '-':
                System.out.println(a-b);
                break;
            case '*':
                System.out.println(a*b);
                break;
            case '/':
                System.out.println(a/b);
                break;
            case '%':
                System.out.println(a%b);
                break;
            default:
                System.out.println("Invalid operator");
        }

    }
}

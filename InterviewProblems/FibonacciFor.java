package InterviewProblems;

import java.util.Scanner;
//calculate the factorial of n using for Recursion
public class FibonacciFor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = 0;
        int b = 1;
        if (n == 0 || n == 1) {
            System.out.println(n);
        } else {
            for (int i = 2; i <= n; i++) {
                int c=a+b;
                a=b;
                b=c;
            }
            System.out.println(b);
        }

    }
    }

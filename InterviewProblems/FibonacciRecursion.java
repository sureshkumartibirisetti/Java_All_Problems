package InterviewProblems;
//calculate the factorial of n using for recursion
import java.util.Scanner;

public class FibonacciRecursion {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int a=0;
        int b=1;
        int c=2;
        System.out.println(fibo(n,a,b,c));
    }

    static int fibo(int n,int a,int b,int c){
        int d=a+b;
        a=b;
        b=d;
        if(n==0 || n==1) return n;
        else if(n==c)  return b;
        return fibo(n,a,b,c+1);
    }

}


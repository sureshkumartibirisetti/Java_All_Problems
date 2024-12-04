package InterviewProblems;
//calculate the factorial of n using for multiple Recursions
import java.util.Scanner;

public class FibonacciMultipleRecursion {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        System.out.println(Fibo(n));
    }
    static int Fibo(int n){
        if(n<=1){
            return n;
        }
        int last=Fibo(n-1);
        int slast=Fibo(n-2);
        return last+slast;
    }
}

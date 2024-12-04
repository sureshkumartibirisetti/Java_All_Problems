package InterviewProblems;
//calculate the factorial of n using for loop
import java.util.Scanner;

public class FactorialFor {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int s=1;
        for(int i=1;i<=a;i++){
            s*=i;
        }
        System.out.println(s);
    }
}

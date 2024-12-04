package InterviewProblems;
//sum of n digits using formulae
import java.util.Scanner;

public class Sum1ToNFormule {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        System.out.println((n*(n+1))/2);
    }
}

package InterviewProblems;
//check Even or odd using ternary Operator
import java.util.Scanner;

public class EvenNOddTernary {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        String res=(a%2==0)?"even":"odd";
        System.out.println(res);
    }
}

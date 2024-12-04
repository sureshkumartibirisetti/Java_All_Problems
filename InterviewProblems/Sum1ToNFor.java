package InterviewProblems;
//sum of n digits using for loop
import java.util.Scanner;

public class Sum1ToNFor {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int s=0;
        for(int i=1;i<=n;i++){
            s+=i;
        }
        System.out.println(s);
    }
}

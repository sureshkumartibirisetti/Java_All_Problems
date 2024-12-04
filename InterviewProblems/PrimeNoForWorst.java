package InterviewProblems;
//to check prime number or not using for loop(worst Case)
import java.util.Scanner;

public class PrimeNoForWorst {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int c=0;
        if(a==0 || a==1){
            System.out.println("Not prime");
        }else {
            for (int i = 2; i <= a; i++) {
                if (a % i == 0) {
                    c++;
                }
            }
            if (c <= 1) {
                System.out.println("Prime");
            } else {
                System.out.println("Not prime");
            }
        }
    }
}

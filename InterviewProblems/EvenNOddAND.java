package InterviewProblems;
//check even and odd while using bitwise and operator
import java.util.Scanner;

public class EvenNOddAND {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        if((a&1)==0){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }
    }
}

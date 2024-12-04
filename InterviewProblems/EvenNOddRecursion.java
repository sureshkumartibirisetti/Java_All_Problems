package InterviewProblems;
//check even or odd while using recursion
import java.util.Scanner;

public class EvenNOddRecursion {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int a1=a%10;
        System.out.println(a1);
        if(iseven(a1)){
            System.out.println("Even");
        }else{
            System.out.println("odd");
        }
    }
    static boolean iseven(int a){
        if(a==0){
            return true;
        } else if (a==1) {
            return false;

        }
        return iseven(a-2);
    }
}

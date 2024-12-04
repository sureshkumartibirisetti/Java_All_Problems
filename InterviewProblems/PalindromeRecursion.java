package InterviewProblems;
//check palindrome or Not using recursion
import java.util.Scanner;

public class PalindromeRecursion {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        if (palin(s,0,s.length())){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
    }
    static boolean palin(String s,int i,int l){
        if(i>=l/2){
            return true;
        }
        if(s.charAt(i)!=s.charAt(l-i-1)){
            return false;
        }
        return palin(s,i+1,l);
    }
}

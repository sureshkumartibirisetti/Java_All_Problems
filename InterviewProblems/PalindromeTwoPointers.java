package InterviewProblems;
//check palindrome or Not using two pointer(i&j)
import java.util.Scanner;

public class PalindromeTwoPointers {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        int i=0;
        int j=s.length()-1;
        int c=0;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                c=1;
            }
            i++;
            j--;
        }
        if (c == 0) {

            System.out.println("Palindrome");
        }else{
            System.out.println("Not palindrome");
        }
    }
}

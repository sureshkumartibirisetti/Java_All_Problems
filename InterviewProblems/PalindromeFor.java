package InterviewProblems;
//check palindrome or Not using for loop
import java.util.Scanner;

public class PalindromeFor {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        String s1="";
        for(int i=0;i<s.length();i++){
            s1=s.charAt(i)+s1;
        }
        System.out.println(s1);
        if (s.equals(s1)) System.out.println("Is palindrome");
        else System.out.println("Not");

    }

}

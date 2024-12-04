package InterviewProblems;

import java.util.Scanner;

public class Sum1ToNRecur {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        System.out.println(func(n));
    }
    static int func(int n){
        if(n==0){
            return 0;
        }
        return n+func(n-1);
    }
}

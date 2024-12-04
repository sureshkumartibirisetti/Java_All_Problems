package InterviewProblems;
//to check prime number or not using for loop(better case)

import java.util.Scanner;

public class PrimeSqrt {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int c=1;
        if(a==0 || a==1){
            System.out.println("Not Prime");
        }else{
            for(int i=2;i<=Math.sqrt(a);i++){
                if(a%i==0){
                    c++;
                }
            }
            if(c==1){
                System.out.println("Prime Number");
            }else{
                System.out.println("Not Prime");
            }
        }
    }
}

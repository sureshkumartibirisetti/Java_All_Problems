package InterviewProblems;

public class SwapMul {
    public static void main(String[] args) {
        int a=20;
        int b=30;
        a=a*b; //a=500
        b=a/b; //b=20
        a=a/b;   //a=30
        System.out.println(a+" "+b);
    }
}

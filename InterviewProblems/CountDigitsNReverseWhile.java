package InterviewProblems;
//count the digit and reverse the number while using while loop
public class CountDigitsNReverseWhile {
    public static void main(String[] args) {
        int a=12345;
        int rev=0;
        int count=0;
        while(a>0){
            int temp=a%10;
            a=a/10;
            rev=rev*10+temp;
            count++;
        }
        System.out.println(count);
        System.out.println(rev);
    }
}

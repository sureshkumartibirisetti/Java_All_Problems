package InterviewProblems;
//count the digits by using formula
public class countDigitsFormule {
    public static void main(String[] args) {
        double a=1234567891011l;
        System.out.println((int)(1+Math.floor(Math.log10(a))));

    }
}

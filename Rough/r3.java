package Rough;

public class r3 {
    public static void main(String[] args) {
        String[] details={"7868190130M7522","5303914400F9211","9273338290F4010"};
        int c=0;
        for(String s1:details){
            if (((s1.charAt(11) - '0') * 10 + (s1.charAt(12) - '0')) > 60)
                c++;
        }
        System.out.println(c);

    }
}

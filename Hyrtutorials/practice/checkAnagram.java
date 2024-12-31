package Hyrtutorials.practice;
//wait for the logic
public class checkAnagram {
    public static void main(String[] args) {
        String a="bbcc";
        String b="dabc";
        a=a.toLowerCase();
        b=b.toLowerCase();
        int sum1=0;
        int sum2=0;
        if(a.length() != b.length()){
            System.out.println("false");
        }else{
            for(int i=0;i<a.length();i++){
                int ch=(int)(a.charAt(i));
                int ch1=(int)(b.charAt(i));
                sum1+=ch;
                sum2+=ch1;
            }
            if(sum1==sum2){
                System.out.println("true");
            }else{
                System.out.println("false");
            }
        }

    }
}

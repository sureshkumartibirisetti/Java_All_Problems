package Rough;

public class r6 {
    public static void main(String[] args) {
        int a=1;
        String s="";
        while(a>0){
            int temp=a%2;
            s=temp+s;
            a=a/2;
        }
        System.out.println(s);
    }
}

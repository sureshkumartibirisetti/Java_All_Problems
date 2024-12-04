package Striver.Recursion;

public class Lc_125 {
    public static void main(String[] args) {
        String s="A man, a plan, a canal: Panama";
        s=s.toLowerCase();
        String s1="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch>='a' && ch<='z'){
                s1=ch+s1;
            }
        }
        System.out.println(s1);


    }
//    static boolean isPalindrome(String s) {


    }


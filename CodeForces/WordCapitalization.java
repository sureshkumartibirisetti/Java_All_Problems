package CodeForces;

import java.util.Scanner;

public class WordCapitalization {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.next();
        String s1="";
        for(int i=0;i<s.length();i++){
            if(i==0){
                if(s.charAt(i)>='a' && s.charAt(i)<='z'){
                    s1+=(char)(s.charAt(i)-32);
                }
                else{
                    s1+=s.charAt(i);
                }
            }else{
                s1+=s.charAt(i);
            }
        }
        System.out.println(s1);
    }
}

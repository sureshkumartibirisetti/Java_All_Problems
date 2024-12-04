package Hyrtutorials.Strings;

import java.util.Scanner;

public class eight {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.next();
        int UC=0;
        int LC=0;
        int  D=0;
        int SC=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='A' && s.charAt(i)<='Z'){
                UC++;
            }else if(s.charAt(i)>='a' && s.charAt(i)<='z'){
                LC++;
            }else if(s.charAt(i)=='&' || s.charAt(i)=='%' || s.charAt(i)=='@' || s.charAt(i)=='#'){
                SC++;
            }else{
                D++;
            }
        }
        System.out.println("UpperCase Letters :"+ UC);
        System.out.println("LowerCase Letters :"+ LC);
        System.out.println("Special Characters :"+ SC);
        System.out.println("Digits :"+ D);
    }
}

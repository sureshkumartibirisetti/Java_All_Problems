package Hyrtutorials.Strings;

import java.util.Scanner;

public class four {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        System.out.println(reverse(s));
    }
    static String reverse(String s){
        String a="";
        for (int i=s.length()-1;i>=0;i--){
            a+=s.charAt(i);
        }
        return a;
    }
}

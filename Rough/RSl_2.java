package Rough;

import java.util.HashSet;

public class RSl_2 {
    public static void main(String[] args) {
        String s="abc";
        int res=0;
        for(int i=0;i<s.length();i++){
            String s1="";
            for(int j=i;j<s.length();j++){
                char ch=s.charAt(j);
                s1+=ch;
                System.out.println(s1);
            }

        }


    }
}

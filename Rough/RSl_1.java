package Rough;

import java.util.HashSet;

public class RSl_1 {
    public static void main(String[] args) {
        String s="ssss";
        int res=0;
        for(int i=0;i<s.length();i++){
            String s1="";
            HashSet<Character> hs=new HashSet<>();
            for(int j=i;j<s.length();j++){
                char ch=s.charAt(j);
                s1+=ch;
                hs.add(s.charAt(j));
                if(s1.length()==hs.size()){
                    res++;
                }
            }

        }
        System.out.println(res);

    }
}

package leetCode;
//2785. Sort Vowels in a StringExample 1:
//
//Input: s = "lEetcOde"
//Output: "lEOtcede"
//Explanation: 'E', 'O', and 'e' are the vowels in s; 'l', 't', 'c', and 'd' are all consonants. The vowels are sorted according to their ASCII values, and the consonants remain in the same places.
//Example 2:
//
//Input: s = "lYmpH"
//Output: "lYmpH"
//Explanation: There are no vowels in s (all characters in s are consonants), so we return "lYmpH".

import java.util.ArrayList;
import java.util.Collections;

public class LC2785 {
    public static void main(String[] args) {
        String s="lEetcOde";
        ArrayList<String> al=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            String ch=s.charAt(i)+"";
            String ch1=ch.toLowerCase();
            if(ch1.equals("a")||ch1.equals("e")||ch1.equals("i")||ch1.equals("o")||ch1.equals("u")){
                al.add(ch);
            }
        }
        String res="";
        Collections.sort(al);
        int j=0;
        for(int i=0;i<s.length();i++){
            String ch=s.charAt(i)+"";
            String ch1=ch.toLowerCase();
            if(ch1.equals("a")||ch1.equals("e")||ch1.equals("i")||ch1.equals("o")||ch1.equals("u")){
                res+=al.get(j);
                j++;
            }else{
                res+=ch;
            }
        }
        System.out.println(res);



    }
}

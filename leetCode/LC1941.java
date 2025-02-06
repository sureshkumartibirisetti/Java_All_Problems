package leetCode;

import java.util.HashMap;

//1941. Check if All Characters Have Equal Number of Occurrences
//Example 1:
//
//Input: s = "abacbc"
//Output: true
//Explanation: The characters that appear in s are 'a', 'b', and 'c'.
//All characters occur 2 times in s.
// Example 2:
//Input: s = "aaabb"
//Output: false
//Explanation: The characters that appear in s are 'a' and 'b'.
// 'a' occurs 3 times while 'b' occurs 2 times, which is not the same
//number of times.
public class LC1941 {
    public static void main(String[] args) {
        String s="abacbca";
        HashMap<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<s.length();i++){
            hm.put(s.charAt(i),hm.getOrDefault(s.charAt(i),0)+1);
        }
        int res=hm.get(s.charAt(0));
        for(char s1:hm.keySet()){
            int c=hm.get(s1);
            if(c!=res){
                System.out.println("false");
                break;
            }
        }
        System.out.println("true");
    }
}
//for(char ch:s.toCharArray()){
//        c.put(ch,c.getOrDefault(ch,0)+1);
//        }

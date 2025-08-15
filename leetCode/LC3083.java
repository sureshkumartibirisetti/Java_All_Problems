package leetCode;

import java.util.HashMap;

/*
3083. Existence of a Substring in a String and Its Reverse
Example 1:
Input: s = "leetcode"
Output: true
Explanation: Substring "ee" is of length 2 which is also present in reverse(s) == "edocteel".
Example 2:
Input: s = "abcba"
Output: true
Explanation: All of the substrings of length 2 "ab", "bc", "cb", "ba" are also present in reverse(s) == "abcba".
Example 3:
Input: s = "abcd"
Output: false
Explanation: T
s=abcdfa
ab,bc,cd,df,fa
af,fd,dc,cb,ba

s="aefae"
ae,ef,fa,ae
ea,af,fe,ea
 */
public class LC3083 {
    public static void main(String[] args) {
        String s="abcd";
        HashMap<String,Integer> map=new HashMap<>();
        int l=0;
        int r=s.length()-1;
        while(l!=s.length()-1 || r!=0){
            char ch1l=s.charAt(l);
            char ch2l=s.charAt(l+1);
            char ch1r=s.charAt(r);
            char ch2r=s.charAt(r-1);
            if(ch1l==ch2l || ch1r==ch2r){
                System.out.println(true);
            }
            String s1l=ch1l+""+ch2l;
            String s2r=ch1r+""+ch2r;
            map.put(s1l,map.getOrDefault(s1l,0)+1);
            map.put(s2r,map.getOrDefault(s2r,0)+1);
            l++;
            r--;
        }
        for(Integer i: map.values()){
            if(i>=2){
                System.out.println(true);
            }
        }
    }
}

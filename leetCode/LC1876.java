package leetCode;

import java.util.HashSet;

/*1876. Substrings of Size Three with Distinct Characters
Example 1:
Input: s = "xyzzaz"
Output: 1
Explanation: There are 4 substrings of size 3: "xyz", "yzz", "zza", and "zaz".
The only good substring of length 3 is "xyz".
Example 2:
Input: s = "aababcabc"
Output: 4
Explanation: There are 7 substrings of size 3: "aab", "aba", "bab", "abc", "bca", "cab", and "abc".
The good substrings are "abc", "bca", "cab", and "abc"
 */
public class LC1876 {
    public static void main(String[] args) {
        String s="aababcabc";
        int res=0;
        for(int i=0;i<s.length()-2;i++){
            HashSet<Character> set=new HashSet<>();
            for(int j=i;j<i+3;j++){
                set.add(s.charAt(j));
            }
            if(set.size()==3){
                res++;
            }
        }
        System.out.println(res);
    }
}

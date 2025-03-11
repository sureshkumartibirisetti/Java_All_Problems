package leetCode;

import java.util.HashMap;

/* 205. Isomorphic Strings
Example 1:
Input: s = "egg", t = "add"
Output: true
Explanation:
The strings s and t can be made identical by:
Mapping 'e' to 'a'.
Mapping 'g' to 'd'.
Example 2:
Input: s = "foo", t = "bar"
Output: false
Explanation:
The strings s and t can not be made identical as 'o' needs to be mapped to both 'a' and 'r'.
Example 3:
Input: s = "paper", t = "title"
Output: true
 */
public class LC205 {
    public static void main(String[] args) {
        String s="badc";
        String t="baba";
        HashMap<Character,Character> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(map.containsKey(t.charAt(i))){
                if(map.get(t.charAt(i))==s.charAt(i)){
                    continue;
                }else{
                    System.out.println(false);
                    break;
                }
            }else{
                map.put(t.charAt(i),s.charAt(i));
            }
        }
        System.out.println(true);
    }
}

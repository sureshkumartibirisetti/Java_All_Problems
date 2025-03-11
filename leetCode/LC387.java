package leetCode;

import java.util.HashMap;

/*387. First Unique Character in a String
Example 1:
Input: s = "leetcode"
Output: 0
Explanation:
The character 'l' at index 0 is the first character that does not occur at any other index.
Example 2:
Input: s = "loveleetcode"
Output: 2
Example 3:
Input: s = "aabb"
Output: -1
 */
public class LC387 {
    public static void main(String[] args) {
        String s="loveleetcode";
        HashMap<Character,Integer> map=new HashMap<>();
        for(char i:s.toCharArray()){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(char i:s.toCharArray()){
            if(map.get(i)==1){
                System.out.println(i);
            }
        }
        System.out.println(-1);
    }
}

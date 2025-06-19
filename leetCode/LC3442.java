package leetCode;

import java.util.HashMap;

/*
Example 1:
Input: s = "aaaaabbc"
Output: 3
Explanaton:
The character 'a' has an odd frequency of 5, and 'b' has an even frequency of 2.
The maximum difference is 5 - 2 = 3.
Example 2:
Input: s = "abcabcab"
Output: 1
Explanation:
The character 'a' has an odd frequency of 3, and 'c' has an even frequency of 2.
The maximum difference is 3 - 2 = 1.
 */
public class LC3442 {
    public static void main(String[] args) {
        String s="aaaaabbc";
        int maxOdd=0;
        int minEven=Integer.MAX_VALUE;
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        for(int i:map.values()){
            if(i%2==0){
                if(minEven>i){
                    minEven=i;
                }
            }else{
                if(maxOdd<i){
                    maxOdd=i;
                }
            }
        }
        System.out.println(maxOdd-minEven);
    }
}

package leetCode;

import java.util.HashMap;

/*
1370. Increasing Decreasing String
Example 1:
Input: s = "aaaabbbbcccc"
Output: "abccbaabccba"
Explanation: After steps 1, 2 and 3 of the first iteration, result = "abc"
After steps 4, 5 and 6 of the first iteration, result = "abccba"
First iteration is done. Now s = "aabbcc" and we go back to step 1
After steps 1, 2 and 3 of the second iteration, result = "abccbaabc"
After steps 4, 5 and 6 of the second iteration, result = "abccbaabccba"
Example 2:
Input: s = "rat"
Output: "art"
Explanation: The word "rat" becomes "art" after re-ordering it with the mentioned algorithm.
 */
public class LC1370 {
    public static void main(String[] args) {
        String s="rat";
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        StringBuilder sb=new StringBuilder();
        int l=s.length();
        int a=0;
        while(a!=l) {
            for (char i = 'a'; i <= 'z'; i++) {
                if (map.containsKey(i) && map.get(i) > 0) {
                    map.put(i,map.get(i)-1);
                    sb.append(i);
                    a++;
                }
            }
            for(char i='z';i>='a';i--){
                if(map.containsKey(i) && map.get(i) > 0) {
                    map.put(i,map.get(i)-1);
                    sb.append(i);
                    a++;
                }
            }
        }
        System.out.println(sb.toString());
    }
}

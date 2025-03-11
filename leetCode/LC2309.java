package leetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.TreeMap;

/*2309. Greatest English Letter in Upper and Lower Case
Example 1:
Input: s = "lEeTcOdE"
Output: "E"
Explanation:
The letter 'E' is the only letter to appear in both lower and upper case.
Example 2:
Input: s = "arRAzFif"
Output: "R"
Explanation:
The letter 'R' is the greatest letter to appear in both lower and upper case.
Note that 'A' and 'F' also appear in both lower and upper case, but 'R' is greater than 'F' or 'A'.
Example 3:
Input: s = "AbCdEfGhIjK"
Output: ""
Explanation:
There is no letter that appears in both lower and upper case.
 */
public class LC2309 {
    public static void main(String[] args) {
        String s="arRAzFif";
        char res='@';
        TreeMap<Character,Integer> map=new TreeMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        for(char i:map.keySet()){
            if(i>='a' && i<='z'){
                char ch=(char)(i-32);
                if(map.containsKey(ch)){
                    if(res<ch){
                        res=ch;
                    }
                }
            }else{
                char ch=(char)(i+32);
                if(map.containsKey(ch)){
                    if(res<i){
                        res=i;
                    }
                }
            }
        }
        System.out.println(res);
//        char i='a';
//        char ch=(char)(i-32);
//        System.out.println(ch);
    }
}

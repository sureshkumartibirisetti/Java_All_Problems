package leetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/*1002. Find Common Characters
Example 1:
Input: words = ["bella","label","roller"]
Output: ["e","l","l"]
Example 2:
Input: words = ["cool","lock","cook"]
Output: ["c","o"]
 */
public class LC1002 {
    public static void main(String[] args) {
        ArrayList<Character> al=new ArrayList<>();
        String[] words={"bella","label","roller"};
        int l= words.length;
        HashMap<Character,Integer> map=new HashMap<>();
        for(String i:words){
            HashSet<Character> set=new HashSet<>();
            for(int j=0;j<i.length();j++){
                set.add(i.charAt(j));
            }
            for(char s:set){
                map.put(s,map.getOrDefault(s,0)+1);
            }
        }
        for(char ch: map.keySet()){
            if(map.get(ch)==l){
                al.add(ch);
            }
        }
        System.out.println(al);

    }

}

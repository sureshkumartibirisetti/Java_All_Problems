package leetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

//884. Uncommon Words from Two Sentences
//Example 1:
//Input: s1 = "this apple is sweet", s2 = "this apple is sour"
//Output: ["sweet","sour"]
//Explanation:
//The word "sweet" appears only in s1, while the word "sour" appears only in s2.
//Example 2:
//Input: s1 = "apple apple", s2 = "banana"
//Output: ["banana"]
public class LC884 {
    public static void main(String[] args) {
        String s="this apple is sweet";
        String[] s1=s.split(" ");
        String ss="this apple is sour";
        String[] s2=ss.split(" ");
        HashMap<String,Integer> map=new HashMap<>();
        for(String i:s1){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(String i:s2){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        System.out.println(map);
        List<String> al=new ArrayList<>();
        for(String i:map.keySet()){
            if(map.get(i)==1) {
                al.add(i);
            }
        }
        System.out.println(al);

    }
}

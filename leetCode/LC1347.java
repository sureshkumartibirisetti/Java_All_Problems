package leetCode;

import java.util.HashMap;

//Input: s = "bab", t = "aba"
//Output: 1
//Explanation: Replace the first 'a' in t with b, t = "bba" which is
//anagram of s.

public class LC1347 {
    public static void main(String[] args) {
        String s = "bab";
        String t = "aba";
        int res=0;
        HashMap<Character, Integer> Hp1 = new HashMap<>();
        HashMap<Character, Integer> Hp2 = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            Hp1.put(ch, Hp1.getOrDefault(ch, 0) + 1);
            char ch1 = t.charAt(i);
            Hp2.put(ch1, Hp2.getOrDefault(ch1, 0) + 1);
        }


    }
}


package leetCode;

import java.util.HashSet;

/*
2062. Count Vowel Substrings of a String
Example 1:
Input: word = "aeiouu"
Output: 2
Explanation: The vowel substrings of word are as follows (underlined):
- "aeiouu"
- "aeiouu"
Example 2:
Input: word = "unicornarihan"
Output: 0
Explanation: Not all 5 vowels are present, so there are no vowel substrings.
Example 3:
Input: word = "cuaieuouac"
Output: 7
Explanation: The vowel substrings of word are as follows (underlined):
- "cuaieuouac"
- "cuaieuouac"
- "cuaieuouac"
- "cuaieuouac"
- "cuaieuouac"
- "cuaieuouac"
- "cuaieuouac"
 */
public class LC2062 {
    public static void main(String[] args) {
        String word="aeiouu";
        HashSet<Character> set=new HashSet<>();
        int res=0;
        for(int i=0;i<word.length()-4;i++){
            set.clear();
            for(int j=i;j<word.length();j++){
                char ch=word.charAt(j);
                if("aeiou".contains(ch+"")){
                    set.add(ch);
                }else{
                    break;
                }
                if(set.size()==5){
                    res++;
                }
            }
        }
        System.out.println(res);
    }
}

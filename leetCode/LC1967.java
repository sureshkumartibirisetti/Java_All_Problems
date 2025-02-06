package leetCode;
//1967. Number of Strings That Appear as Substrings in Word
//Example 1:
//
//Input: patterns = ["a","abc","bc","d"], word = "abc"
//Output: 3
//Explanation:
//        - "a" appears as a substring in "abc".
//        - "abc" appears as a substring in "abc".
//        - "bc" appears as a substring in "abc".
//        - "d" does not appear as a substring in "abc".
//        3 of the strings in patterns appear as a substring in word.
//Example 2:
//
//Input: patterns = ["a","b","c"], word = "aaaaabbbbb"
//Output: 2
//Explanation:
//        - "a" appears as a substring in "aaaaabbbbb".
//        - "b" appears as a substring in "aaaaabbbbb".
//        - "c" does not appear as a substring in "aaaaabbbbb".
//        2 of the strings in patterns appear as a substring in word.
public class LC1967 {
    public static void main(String[] args) {
        String[] patterns={"a","b","c"};
        String word="ab";
        int c=0;
        for(String s:patterns){
            if(word.contains(s)){
                c++;
            }
        }
        System.out.println(c);
    }
}

package leetCode;
/*
389. Find the Difference
Example 1:
Input: s = "abcd", t = "abcde"
Output: "e"
Explanation: 'e' is the letter that was added.
Example 2:
Input: s = "", t = "y"
Output: "y"
 */
public class LC389 {
    public static void main(String[] args) {
        String s="abcd";
        String t="abcde";
        int a=0;
        int b=0;
        int i;
        for(i=0;i<s.length();i++){
            a+=s.charAt(i);
            b+=t.charAt(i);
        }
        b+=t.charAt(i);
        System.out.println((char)(b-a)+"");



    }
}

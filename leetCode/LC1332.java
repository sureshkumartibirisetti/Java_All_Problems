package leetCode;
/*
1332. Remove Palindromic Subsequences
Example 1:
Input: s = "ababa"
Output: 1
Explanation: s is already a palindrome, so its entirety can be removed in a single step.
Example 2:
Input: s = "abb"
Output: 2
Explanation: "abb" -> "bb" -> "".
Remove palindromic subsequence "a" then "bb".
Example 3:
Input: s = "baabb"
Output: 2
Explanation: "baabb" -> "b" -> "".
Remove palindromic subsequence "baab" then "b".
 */
public class LC1332 {
    public static void main(String[] args) {
        String s="ababa";
        if(isPalin(s)){
            System.out.println(1);
        }
        System.out.println(2);
    }
    static boolean isPalin(String s){
        int l=0;
        int h=s.length()-1;
        while(l<h){
            if(s.charAt(l)!=s.charAt(h)){
                return false;
            }
        }
        return true;
    }
}

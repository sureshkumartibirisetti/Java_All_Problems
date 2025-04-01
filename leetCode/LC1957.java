package leetCode;
/*1957. Delete Characters to Make Fancy String
Example 1:
Input: s = "leeetcode"
Output: "leetcode"
Explanation:
Remove an 'e' from the first group of 'e's to create "leetcode".
No three consecutive characters are equal, so return "leetcode".
Example 2:
Input: s = "aaabaaaa"
Output: "aabaa"
Explanation:
Remove an 'a' from the first group of 'a's to create "aabaaaa".
Remove two 'a's from the second group of 'a's to create "aabaa".
No three consecutive characters are equal, so return "aabaa".
Example 3:
Input: s = "aab"
Output: "aab"
Explanation: No three consecutive characters are equal, so return "aab".
 */
public class LC1957 {
    public static void main(String[] args) {
        String s="leeetcode";
        StringBuilder res=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(res.length()<2){
                res.append(s.charAt(i));
            }else{
                if(res.charAt(res.length()-1)==s.charAt(i) && res.charAt(res.length()-2)==s.charAt(i)){
                    continue;
                }else{
                    res.append(s.charAt(i));
                }
            }
        }
        System.out.println(res.toString());

    }
}

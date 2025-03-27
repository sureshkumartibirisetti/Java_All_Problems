package leetCode;
/*
1624. Largest Substring Between Two Equal Characters
Example 1:
Input: s = "aa"
Output: 0
Explanation: The optimal substring here is an empty substring between the two 'a's.
Example 2:
Input: s = "abca"
Output: 2
Explanation: The optimal substring here is "bc".
Example 3:
Input: s = "cbzxy"
Output: -1
Explanation: There are no characters that appear twice in s.
 */
public class LC1624 {
    public static void main(String[] args) {
        String s="abca";
        int res=-1;
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j)){
                    if(res<(j-i-1)){
                        res=j-i-1;
                    }
                }
            }
        }
        System.out.println(res);

    }
}

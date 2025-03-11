package leetCode;

import java.util.Arrays;

/*2124. Check if All A's Appears Before All B's
Example 1:
Input: s = "aaabbb"
Output: true
Explanation:
The 'a's are at indices 0, 1, and 2, while the 'b's are at indices 3, 4, and 5.
Hence, every 'a' appears before every 'b' and we return true.
Example 2:
Input: s = "abab"
Output: false
Explanation:
There is an 'a' at index 2 and a 'b' at index 1.
Hence, not every 'a' appears before every 'b' and we return false.
Example 3:
Input: s = "bbb"
Output: true
Explanation:
There are no 'a's, hence, every 'a' appears before every 'b' and we return true.
 */
public class LC2124 {
    public static void main(String[] args) {
        String s="aaabbb";
        String[] arr=s.split("");
        Arrays.sort(arr);
        System.out.println(s.equals(String.join("", arr)));

    }
}

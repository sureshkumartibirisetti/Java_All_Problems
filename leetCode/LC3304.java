package leetCode;
/*
3304. Find the K-th Character in String Game I
Example 1:
Input: k = 5
Output: "b"
Explanation:
Initially, word = "a". We need to do the operation three times:
Generated string is "b", word becomes "ab".
Generated string is "bc", word becomes "abbc".
Generated string is "bccd", word becomes "abbcbccd".
Example 2:
Input: k = 10
Output: "c"
 */
public class LC3304 {
    public static void main(String[] args) {
        int k=10;
        String a="a";
        while(a.length()<=k) {
            String s = "";
            for (int i = 0; i < a.length(); i++) {
                if (a.charAt(i) == 'z') {
                    s += 'a';
                } else {
                    s += (char) (a.charAt(i) + 1);
                }
            }
            a=a+s;
        }
        System.out.println(a);
        System.out.println(a.charAt(k-1));

    }
}

package leetCode;
/*2586. Count the Number of Vowel Strings in Range
Example 1:

Input: words = ["are","amy","u"], left = 0, right = 2
Output: 2
Explanation:
        - "are" is a vowel string because it starts with 'a' and ends with 'e'.
        - "amy" is not a vowel string because it does not end with a vowel.
- "u" is a vowel string because it starts with 'u' and ends with 'u'.
The number of vowel strings in the mentioned range is 2.
Example 2:

Input: words = ["hey","aeo","mu","ooo","artro"], left = 1, right = 4
Output: 3
Explanation:
        - "aeo" is a vowel string because it starts with 'a' and ends with 'o'.
        - "mu" is not a vowel string because it does not start with a vowel.
- "ooo" is a vowel string because it starts with 'o' and ends with 'o'.
        - "artro" is a vowel string because it starts with 'a' and ends with 'o'.
The number of vowel strings in the mentioned range is 3.
 */
public class LC2586 {
    public static void main(String[] args) {
        String[] words={"hey","aeo","mu","ooo","artro"};
        int left = 1;
        int right=4;
        int res=0;
        for(int i=left;i<=right;i++){
            String s="aeiou";
            String ss=words[i];
            if(s.contains(ss.charAt(0)+"") && s.contains(ss.charAt((ss.length()-1))+"")){
                res++;
            }
        }
        System.out.println(res);
    }
}

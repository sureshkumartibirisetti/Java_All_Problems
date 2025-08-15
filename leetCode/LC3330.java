package leetCode;
/*
3330. Find the Original Typed String I
Example 1:
Input: word = "abbcccc"
Output: 5
Explanation:
The possible strings are: "abbcccc", "abbccc", "abbcc", "abbc", and "abcccc".
Example 2:
Input: word = "abcd"
Output: 1
Explanation:
The only possible string is "abcd".
Example 3:
Input: word = "aaaa"
Output: 4
 */
public class LC3330 {
    public static void main(String[] args) {
        String word="abcd";
        int l=0;
        int r=1;
        int res=0;
        while(r!=word.length()){
            if(word.charAt(l)!=word.charAt(r)){
                l=r;
                r=l+1;
            }
            else{
                res++;
                r++;
            }
        }
        System.out.println(res+1);
    }
}

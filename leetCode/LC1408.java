package leetCode;

import java.util.ArrayList;
import java.util.List;

/*1408. String Matching in an Array
Example 1:
Input: words = ["mass","as","hero","superhero"]
Output: ["as","hero"]
Explanation: "as" is substring of "mass" and "hero" is substring of "superhero".
        ["hero","as"] is also a valid answer.
        Example 2:
Input: words = ["leetcode","et","code"]
Output: ["et","code"]
Explanation: "et", "code" are substring of "leetcode".
Example 3:
Input: words = ["blue","green","bu"]
Output: []
Explanation: No string of words is substring of another string.
 */
public class LC1408 {
    public static void main(String[] args) {
        String[] words={"leetcode","et","code"};
        List<String> list=new ArrayList<>();
        for(int i=0;i<words.length;i++){
            for(int j=0;j<words.length;j++){
                if(words[i].contains(words[j]) && words[i]!=words[j]){
                    list.add(words[j]);
                }
            }
        }
        System.out.println(list);
    }
}

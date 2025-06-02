package leetCode;

import java.util.ArrayList;
import java.util.List;

/*
2900. Longest Unequal Adjacent Groups Subsequence I
Example 1:
Input: words = ["e","a","b"], groups = [0,0,1]
Output: ["e","b"]
Explanation: A subsequence that can be selected is ["e","b"] because groups[0] != groups[2]. Another subsequence that can be selected is ["a","b"] because groups[1] != groups[2]. It can be demonstrated that the length of the longest subsequence of indices that satisfies the condition is 2.
Example 2:
Input: words = ["a","b","c","d"], groups = [1,0,1,1]
Output: ["a","b","c"]
Explanation: A subsequence that can be selected is ["a","b","c"] because groups[0] != groups[1] and groups[1] != groups[2]. Another subsequence that can be selected is ["a","b","d"] because groups[0] != groups[1] and groups[1] != groups[3]. It can be shown that the length of the longest subsequence of indices that satisfies the condition is 3.
 */
public class LC2900 {
    public static void main(String[] args) {
        String[] words={"e","a","b"};
        int[] groups={0,0,1};
        List<String> res=new ArrayList<>();
        res.add(words[0]);
        for(int i=1;i< words.length;i++){
            if(groups[i]!=groups[i-1]){
                res.add(words[i]);
            }
        }
        System.out.println(res);
    }
}

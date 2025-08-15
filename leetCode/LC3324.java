package leetCode;

import java.util.ArrayList;
import java.util.List;

/*
3324. Find the Sequence of Strings Appeared on the Screen
Example 1:
Input: target = "abc"
Output: ["a","aa","ab","aba","abb","abc"]
Explanation:
The sequence of key presses done by Alice are:
Press key 1, and the string on the screen becomes "a".
Press key 1, and the string on the screen becomes "aa".
Press key 2, and the string on the screen becomes "ab".
Press key 1, and the string on the screen becomes "aba".
Press key 2, and the string on the screen becomes "abb".
Press key 2, and the string on the screen becomes "abc".
Example 2:
Input: target = "he"
Output: ["a","b","c","d","e","f","g","h","ha","hb","hc","hd","he"]
 */
public class LC3324 {
    public static void main(String[] args) {
        String target="he";
        List<String> res=new ArrayList<>();
        String org="";
        for(int i=0;i<target.length();i++){
            char ch=target.charAt(i);
            for(char j='a';j<=ch;j++){
                res.add(org+j);
            }
            org+=ch;
        }
        System.out.println(res);
    }

}

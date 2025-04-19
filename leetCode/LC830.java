package leetCode;

import java.util.ArrayList;
import java.util.List;

/*
830. Positions of Large Groups
Example 1:
Input: s = "abbxxxxzzy"
Output: [[3,6]]
Explanation: "xxxx" is the only large group with start index 3 and end index 6.
Example 2:
Input: s = "abc"
Output: []
Explanation: We have groups "a", "b", and "c", none of which are large groups.
Example 3:
Input: s = "abcdddeeeeaabbbcd"
Output: [[3,5],[6,9],[12,14]]
Explanation: The large groups are "ddd", "eeee", and "bbb".
 */
public class LC830 {
    public static void main(String[] args) {
        String s="aaa";
        List<List<Integer>> res=new ArrayList<>();
        int i=0;
        int j=1;
        while(j!=s.length()){
            List<Integer> list=new ArrayList<>();
            char ch=s.charAt(i);
            char ch1=s.charAt(j);
            if(ch==ch1 && j!=s.length()-1){
                j++;
            }
            else if(ch==ch1 && j==s.length()-1){
                if(j-i+1>=3){
                    list.add(i);
                    list.add(j);
                    res.add(list);
                }
                i=j;
                j=j+1;
            }
            else{
                if(j-i>=3){
                    list.add(i);
                    list.add(j-1);
                    res.add(list);
                }
                i=j;
                j=j+1;

            }

        }
        System.out.println(res);

    }
}

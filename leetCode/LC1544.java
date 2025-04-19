package leetCode;

import java.util.Stack;
import java.util.stream.Collectors;

/*
1544. Make The String Great
Example 1:
Input: s = "leEeetcode"
Output: "leetcode"
Explanation: In the first step, either you choose i = 1 or i = 2, both will result "leEeetcode" to be reduced to "leetcode".
Example 2:
Input: s = "abBAcC"
Output: ""
Explanation: We have many possible scenarios, and all lead to the same answer. For example:
"abBAcC" --> "aAcC" --> "cC" --> ""
"abBAcC" --> "abBA" --> "aA" --> ""
Example 3:
Input: s = "s"
Output: "s"
 */
public class LC1544 {
    public static void main(String[] args) {
        String s="abBAcCdd";
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(stack.isEmpty()){
                stack.add(ch);
            } else if((stack.peek()==(char)(ch+32))|| (stack.peek()==(char)(ch-32))) {
                stack.pop();
            }else{
                stack.add(ch);
            }
        }
        String stStr = stack.stream().map(s1 -> s1.toString()).collect(Collectors.joining(""));
        System.out.println(stStr);
    }

}

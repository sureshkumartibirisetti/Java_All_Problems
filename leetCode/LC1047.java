package leetCode;

import java.util.Stack;

/*1047. Remove All Adjacent Duplicates In String
Example 1:
Input: s = "abbaca"
Output: "ca"
Explanation:
        For example, in "abbaca" we could remove "bb" since the letters are adjacent and equal, and this is the only possible move.  The result of this move is that the string is "aaca", of which only "aa" is possible, so the final string is "ca".
Example 2:
Input: s = "azxxzy"
Output: "ay"
 */
public class LC1047 {
    public static void main(String[] args) {


        String s = "azxxzy";
        String res="";
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if(stack.isEmpty()){
                stack.push(s.charAt(i));
            }else if(stack.peek()==s.charAt(i)){
                stack.pop();
            }else{
                stack.push(s.charAt(i));
            }

        }
        for(char i:stack){
            res+=i;
        }
        System.out.println(res);
    }
}

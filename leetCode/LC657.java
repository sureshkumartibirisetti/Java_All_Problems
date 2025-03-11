package leetCode;

import java.util.HashMap;

//657. Robot Return to Origin
//Example 1:
//Input: moves = "UD"
//Output: true
//Explanation: The robot moves up once, and then down once. All moves have the same magnitude, so it ended up at the origin where it started. Therefore, we return true.
//Example 2:
//Input: moves = "LL"
//Output: false
//Explanation: The robot moves left twice. It ends up two "moves" to the left of the origin. We return false because it is not at the origin at the end of its moves.
public class LC657 {
    public static void main(String[] args) {
        String s="LL";
        int[] ch=new int[120];
        for(char c:s.toCharArray())
        {
            ch[c]++;
        }
        System.out.println( (ch['U']==ch['D']&ch['L']==ch['R']));
    }
}

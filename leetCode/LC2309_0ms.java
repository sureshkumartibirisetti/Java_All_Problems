package leetCode;
/*2309. Greatest English Letter in Upper and Lower CaseExample 1:
Input: s = "lEeTcOdE"
Output: "E"
Explanation:
The letter 'E' is the only letter to appear in both lower and upper case.
Example 2:
Input: s = "arRAzFif"
Output: "R"
Explanation:
The letter 'R' is the greatest letter to appear in both lower and upper case.
Note that 'A' and 'F' also appear in both lower and upper case, but 'R' is greater than 'F' or 'A'.
Example 3:
Input: s = "AbCdEfGhIjK"
Output: ""
Explanation:
There is no letter that appears in both lower and upper case.
 */
public class LC2309_0ms {
    public static void main(String[] args) {
        String s="AbCdEfGhIjK";
        for(char i='z';i>='a';i--){
            if(s.contains(i+"")&&s.contains((i-32)+"")){
                System.out.println(((char)(i-32))+"");
            }
        }
        System.out.println("");
    }
}

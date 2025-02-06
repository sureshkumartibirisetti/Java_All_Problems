package leetCode;
//1021. Remove Outermost Parentheses
//Input: s = "(()())(())"
//Output: "()()()"
//Explanation:
//The input string is "(()())(())", with primitive decomposition "(()())" + "(())".
//After removing outer parentheses of each part, this is "()()" + "()" = "()()()".
//Input: s = "()()"
//Output: ""
//Explanation:
//The input string is "()()", with primitive decomposition "()" + "()".
//After removing outer parentheses of each part, this is "" + "" = "".
public class LC1021 {
    public static void main(String[] args) {
        String s="(()())(())";
        String res="";
        if((s.charAt(0)=='(' && s.charAt(1)=='(')&&(s.charAt(s.length()-1)==')' && s.charAt(s.length()-2)==')')){
            for(int i=1;i<s.length()-1;i++){
                res+=s.charAt(i);
            }
            System.out.println(res);
        }else{
            System.out.println(res);
        }
    }
}

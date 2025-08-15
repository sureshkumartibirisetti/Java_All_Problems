package leetCode;
/*
168. Excel Sheet Column Title
 Example 1:
Input: columnNumber = 1
Output: "A"
Example 2:
Input: columnNumber = 28
Output: "AB"
Example 3:
Input: columnNumber = 701
Output: "ZY"
 */
public class LC168 {
    public static void main(String[] args) {
        int c=701;
        StringBuilder sb=new StringBuilder();
        while(c>0){
            c--;
            sb.append((char)(c%26+'A'));
            c/=26;
        }
        System.out.println(sb.reverse().toString());
    }
}

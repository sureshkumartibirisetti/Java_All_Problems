package leetCode;
/*
3498. Reverse Degree of a String
Example 1:
Input: s = "abc"
Output: 148
Explanation:
Letter	Index in Reversed Alphabet	Index in String	Product
'a'	26	1	26
'b'	25	2	50
'c'	24	3	72
The reversed degree is 26 + 50 + 72 = 148.
Example 2:
Input: s = "zaza"
Output: 160
Explanation:
Letter	Index in Reversed Alphabet	Index in String	Product
'z'	1	1	1
'a'	26	2	52
'z'	1	3	3
'a'	26	4	104
The reverse degree is 1 + 52 + 3 + 104 = 160.
 */
public class LC3498 {
    public static void main(String[] args) {
        String s="abc";
        int sum=0;
        for(int i=0;i<s.length();i++){
            sum+=((26-(s.charAt(i)-97))*(i+1));
        }
        System.out.println(sum);
    }
}

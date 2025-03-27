package leetCode;
/*
2544. Alternating Digit Sum
Example 1:
Input: n = 521
Output: 4
Explanation: (+5) + (-2) + (+1) = 4.
Example 2:
Input: n = 111
Output: 1
Explanation: (+1) + (-1) + (+1) = 1.
Example 3:
Input: n = 886996
Output: 0
Explanation: (+8) + (-8) + (+6) + (-9) + (+9) + (-6) = 0.
 */
public class LC2544 {
    public static void main(String[] args) {
        int n=886996;
        int a=0;
        int b=0;
        String temp=Integer.toString(n);
        for(int i=1;i<temp.length();i+=2){
            b-=temp.charAt(i)-'0';
            a+=temp.charAt(i-1)-'0';
        }
        if(temp.length()%2!=0){
            a+=temp.charAt(temp.length()-1)-'0';
        }
        System.out.println(a+b);
    }
}

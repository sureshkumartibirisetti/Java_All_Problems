package leetCode;
/*
3461. Check If Digits Are Equal in String After Operations I
Example 1:
Input: s = "3902"
Output: true
Explanation:
Initially, s = "3902"
First operation:
(s[0] + s[1]) % 10 = (3 + 9) % 10 = 2
(s[1] + s[2]) % 10 = (9 + 0) % 10 = 9
(s[2] + s[3]) % 10 = (0 + 2) % 10 = 2
s becomes "292"
Second operation:
(s[0] + s[1]) % 10 = (2 + 9) % 10 = 1
(s[1] + s[2]) % 10 = (9 + 2) % 10 = 1
s becomes "11"
Since the digits in "11" are the same, the output is true.
Example 2:
Input: s = "34789"
Output: false
Explanation:
Initially, s = "34789".
After the first operation, s = "7157".
After the second operation, s = "862".
After the third operation, s = "48".
Since '4' != '8', the output is false.
 */
public class LC3461 {
    public static void main(String[] args) {
        String s="3902";
        while(s.length()!=2){
            String s1="";
            for(int i=1;i<s.length();i++){
               int a=((s.charAt(i)-'0')+(s.charAt(i-1)-'0'))%10;
               s1+=a+"";
            }
            s=s1;
        }
        System.out.println(s);
        if(s.charAt(0)==s.charAt(1)){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}

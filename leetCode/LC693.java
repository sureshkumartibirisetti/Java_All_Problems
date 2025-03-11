package leetCode;
/*693. Binary Number with Alternating Bits
Example 1:
Input: n = 5
Output: true
Explanation: The binary representation of 5 is: 101
Example 2:
Input: n = 7
Output: false
Explanation: The binary representation of 7 is: 111.
Example 3:
Input: n = 11
Output: false
Explanation: The binary representation of 11 is: 1011.
 */
public class LC693 {
    public static void main(String[] args) {
        int n=5;
        String s=Integer.toBinaryString(n);
        System.out.println(s); //101
        for(int i=1;i<s.length();i+=2){
            if(s.charAt(i)=='0' && s.charAt(i-1)=='1'){
                continue;
            }else {
                System.out.println(false);
            }
        }
        if(s.length()%2!=0){
            if(s.charAt(s.length()-1)!='1'){
                System.out.println(false);
            }
        }
        System.out.println(true);
    }
}

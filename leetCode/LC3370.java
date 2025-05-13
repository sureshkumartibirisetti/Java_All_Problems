package leetCode;
/*
3370. Smallest Number With All Set Bits
Example 1:
Input: n = 5
Output: 7
Explanation:
The binary representation of 7 is "111".
Example 2:
Input: n = 10
Output: 15
Explanation:
The binary representation of 15 is "1111".
Example 3:
Input: n = 3
Output: 3
Explanation:
The binary representation of 3 is "11".
 */
public class LC3370 {
    public static void main(String[] args) {
        int n=10;
        int res=0;
        String s=Integer.toBinaryString(n);
        for(int i=0;i<s.length();i++){
            res+=Math.pow(2,i);
        }
        System.out.println(res);
    }
}

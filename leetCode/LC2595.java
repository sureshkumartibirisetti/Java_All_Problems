package leetCode;

import java.util.Arrays;

/*2595. Number of Even and Odd Bits
Example 1:
Input: n = 50
Output: [1,2]
Explanation:
The binary representation of 50 is 110010.
It contains 1 on indices 1, 4, and 5.
Example 2:
Input: n = 2
Output: [0,1]
Explanation:
The binary representation of 2 is 10.
It contains 1 only on index 1.
 */
public class LC2595 {
    public static void main(String[] args) {
        int n=2;
        String s=Integer.toBinaryString(n);
        int even=0;
        int odd=0;
        int j=0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)=='1'){
                if(j%2==0){
                    even++;
                    j++;
                }else{
                    odd++;
                    j++;
                }
            }else{
                j++;
            }
        }
        System.out.println(Arrays.toString(new int[]{even,odd}));
    }
}

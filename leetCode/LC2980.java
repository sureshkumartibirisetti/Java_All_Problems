package leetCode;
/*
2980. Check if Bitwise OR Has Trailing Zeros
Example 1:
Input: nums = [1,2,3,4,5]
Output: true
Explanation: If we select the elements 2 and 4, their bitwise OR is 6, which has the binary representation "110" with one trailing zero.
Example 2:
Input: nums = [2,4,8,16]
Output: true
Explanation: If we select the elements 2 and 4, their bitwise OR is 6, which has the binary representation "110" with one trailing zero.
Other possible ways to select elements to have trailing zeroes in the binary representation of their bitwise OR are: (2, 8), (2, 16), (4, 8), (4, 16), (8, 16), (2, 4, 8), (2, 4, 16), (2, 8, 16), (4, 8, 16), and (2, 4, 8, 16).
Example 3:
Input: nums = [1,3,5,7,9]
Output: false
Explanation: There is no possible way to select two or more elements to have trailing zeros in the binary representation of their bitwise OR.
 */
public class LC2980 {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5};
        int c=0;
        for(int i:nums){
            if(i%2==0){
                c++;
            }
        }
        if(c>=2){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}

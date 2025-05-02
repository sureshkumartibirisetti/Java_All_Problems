package leetCode;
/*
1822. Sign of the Product of an Array
Example 1:
Input: nums = [-1,-2,-3,-4,3,2,1]
Output: 1
Explanation: The product of all values in the array is 144, and signFunc(144) = 1
Example 2:
Input: nums = [1,5,0,2,-3]
Output: 0
Explanation: The product of all values in the array is 0, and signFunc(0) = 0
Example 3:
Input: nums = [-1,1,-1,1,-1]
Output: -1
Explanation: The product of all values in the array is -1, and signFunc(-1) = -1
 */
public class LC1822 {
    public static void main(String[] args) {
        int[] nums={-1,-2,-3,-4,3,2,1};
        int n=0;
        for(int i:nums){
            if(i==0){
                System.out.println(0);
            } else if (i<0) {
                n++;
            }
        }
        if(n%2!=0){
            System.out.println(-1);
        }
        System.out.println(1);

    }
}

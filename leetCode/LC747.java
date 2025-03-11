package leetCode;

import java.util.Arrays;

/*747. Largest Number At Least Twice of Others
Example 1:
Input: nums = [3,6,1,0]
Output: 1
Explanation: 6 is the largest integer.
For every other number in the array x, 6 is at least twice as big as x.
The index of value 6 is 1, so we return 1.
Example 2:
Input: nums = [1,2,3,4]
Output: -1
Explanation: 4 is less than twice the value of 3, so we return -1.
 */
public class LC747 {
    public static void main(String[] args) {
        int[] nums={1,2,3,4};
        int max=0;
        int index=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
                index=i;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]*2>max && i!=index){
                index=-1;
            }
        }
        System.out.println(index);

    }
}

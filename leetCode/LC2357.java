package leetCode;

import java.lang.reflect.Array;
import java.util.Arrays;

/*2357. Make Array Zero by Subtracting Equal Amounts
Example 1:
Input: nums = [1,5,0,3,5]
Output: 3
Explanation:
In the first operation, choose x = 1. Now, nums = [0,4,0,2,4].
In the second operation, choose x = 2. Now, nums = [0,2,0,0,2].
In the third operation, choose x = 2. Now, nums = [0,0,0,0,0].
Example 2:
Input: nums = [0]
Output: 0
Explanation: Each element in nums is already 0 so no operations are needed.
 */
public class LC2357 {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6};
        Arrays.sort(nums);
        int res=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                int temp=nums[i];
                for(int j=i;j<nums.length;j++){
                    nums[j]=nums[j]-temp;
                }
                res++;
            }
        }
        System.out.println(Arrays.toString(nums));
        System.out.println(res);
    }
}

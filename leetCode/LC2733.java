package leetCode;

import java.util.Arrays;

/*2733. Neither Minimum nor Maximum
Example 1:
Input: nums = [3,2,1,4]
Output: 2
Explanation: In this example, the minimum value is 1 and the maximum value is 4. Therefore, either 2 or 3 can be valid answers.
Example 2:
Input: nums = [1,2]
Output: -1
Explanation: Since there is no number in nums that is neither the maximum nor the minimum, we cannot select a number that satisfies the given condition. Therefore, there is no answer.
Example 3:
Input: nums = [2,1,3]
Output: 2
Explanation: Since 2 is neither the maximum nor the minimum value in nums, it is the only valid answer.
 */
public class LC2733 {
    public static void main(String[] args) {
        int[] nums={3,2,1,4};
        if(nums.length<=2){
            System.out.println(-1);
        }
        Arrays.sort(nums);
        System.out.println(nums[1]);

    }
}

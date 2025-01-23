package leetCode.blind75;

import java.lang.reflect.Array;
import java.util.Arrays;

//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//You may assume that each input would have exactly one solution, and you may not use the same element twice.
//You can return the answer in any order.
//Example 1:
//Input: nums = [2,7,11,15], target = 9
//Output: [0,1]
//Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
//Example 2:
//Input: nums = [3,2,4], target = 6
//Output: [1,2]
//Example 3:
//Input: nums = [3,3], target = 6
//Output: [0,1]
public class LC1_optimal {
    public static void main(String[] args) {
        int[] nums={3,2,4};
        int target=6;
        int left=0;
        int right=nums.length-1;
        Arrays.sort(nums);
//        System.out.println(Arrays.toString(nums));
        while(left<right){
            int sum=nums[left]+nums[right];
            if(sum==target){
                System.out.println(Arrays.toString(new int[]{left,right}));
                break;
            }else if(sum>target){
                right--;
            }else{
                left++;
            }
        }
    }
}

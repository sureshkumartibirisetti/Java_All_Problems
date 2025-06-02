package leetCode;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;

/*
3024. Type of Triangle
Example 1:
Input: nums = [3,3,3]
Output: "equilateral"
Explanation: Since all the sides are of equal length, therefore, it will form an equilateral triangle.
Example 2:
Input: nums = [3,4,5]
Output: "scalene"
Explanation:
nums[0] + nums[1] = 3 + 4 = 7, which is greater than nums[2] = 5.
nums[0] + nums[2] = 3 + 5 = 8, which is greater than nums[1] = 4.
nums[1] + nums[2] = 4 + 5 = 9, which is greater than nums[0] = 3.
Since the sum of the two sides is greater than the third side for all three cases, therefore, it can form a triangle.
As all the sides are of different lengths, it will form a scalene triangle.
 */
public class LC3024 {
    public static void main(String[] args) {
        int[] nums={3,3,3};
        Arrays.sort(nums);
        if(nums[0]+nums[1]>=nums[2]){
            if(nums[0]==nums[1] && nums[1]==nums[2]){
//                return "equilateral";
            }else if((nums[0]==nums[1])||(nums[1]==nums[2])||nums[0]==nums[3]){
//                return  "isosceles";
            }else{
//                return "scalene";
            }
        }
    }
}

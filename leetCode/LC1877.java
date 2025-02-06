package leetCode;
//1877. Minimize Maximum Pair Sum in Array
//Example 1:
//
//Input: nums = [3,5,2,3]
//Output: 7
//Explanation: The elements can be paired up into pairs (3,3) and (5,2).
//The maximum pair sum is max(3+3, 5+2) = max(6, 7) = 7.Example 2:
//
//Input: nums = [3,5,4,2,4,6]
//Output: 8
//Explanation: The elements can be paired up into pairs (3,5), (4,4), and (6,2).
//The maximum pair sum is max(3+5, 4+4, 6+2) = max(8, 8, 8) = 8.

import java.util.Arrays;

public class LC1877 {
    public static void main(String[] args) {
        int[] nums={3,5,4,2,4,6};
        Arrays.sort(nums);
        int i=0;
        int j=nums.length-1;
        int max=0;
        while(i<j){
            if(nums[i]+nums[j]>max){
                max=nums[i]+nums[j];
            }
            i++;
            j--;
        }
        System.out.println(max);
    }
}

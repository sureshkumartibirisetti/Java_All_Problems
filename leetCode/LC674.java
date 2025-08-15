package leetCode;
/*
674. Longest Continuous Increasing Subsequence
Example 1:
Input: nums = [1,3,5,4,7]
Output: 3
Explanation: The longest continuous increasing subsequence is [1,3,5] with length 3.
Even though [1,3,5,7] is an increasing subsequence, it is not continuous as elements 5 and 7 are separated by element
4.
Example 2:
Input: nums = [2,2,2,2,2]
Output: 1
Explanation: The longest continuous increasing subsequence is [2] with length 1. Note that it must be strictly
increasing.
 */
public class LC674 {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6,5,4,3,2,1};
        int res=1;
        int temp=1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]<nums[i+1]){
                temp++;
            }else{
               res=Math.max(res,temp);
               temp=1;
            }
        }
        System.out.println(res);
    }
}

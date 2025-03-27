package leetCode;
/*
3423. Maximum Difference Between Adjacent Elements in a Circular Array
Example 1:
Input: nums = [1,2,4]
Output: 3
Explanation:
Because nums is circular, nums[0] and nums[2] are adjacent. They have the maximum absolute difference of |4 - 1| = 3.
Example 2:
Input: nums = [-5,-10,-5]
Output: 5
Explanation:
The adjacent elements nums[0] and nums[1] have the maximum absolute difference of |-5 - (-10)| = 5.
 */
public class LC3423 {
    public static void main(String[] args) {
        int[] nums={-5,-10,-5};
        int res=0;
        for(int i=1;i<nums.length;i++){
            int a=Math.abs(nums[i]-nums[i-1]);
            if(res<a){
                res=a;

            }
        }
        int b=Math.abs(nums[0]-nums[nums.length-1]);
        if(b>res){
            res=b;
        }
        System.out.println(res);
    }
}

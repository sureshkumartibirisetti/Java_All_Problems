package leetCode;
/*
724. Find Pivot Index
Example 1:
Input: nums = [1,7,3,6,5,6]
Output: 3
Explanation:
The pivot index is 3.
Left sum = nums[0] + nums[1] + nums[2] = 1 + 7 + 3 = 11
Right sum = nums[4] + nums[5] = 5 + 6 = 11
Example 2:
Input: nums = [1,2,3]
Output: -1
Explanation:
There is no index that satisfies the conditions in the problem statement.
Example 3:
Input: nums = [2,1,-1]
Output: 0
Explanation:
The pivot index is 0.
Left sum = 0 (no elements to the left of index 0)
Right sum = nums[1] + nums[2] = 1 + -1 = 0
 */
public class LC724 {
    public static void main(String[] args) {
        int[] nums={1,7,3,6,5,6};
        int res=-1;
        for(int i=0;i< nums.length;i++){
            int left_sum=0;
            int right_sum=0;
            for(int a=0;a<i;a++){
                left_sum+=nums[a];
            }
            for(int b=i+1;b<nums.length;b++){
                right_sum+=nums[b];
            }
            if(left_sum==right_sum){
                res=i;
                break;
            }
        }
        System.out.println(res);
    }
}

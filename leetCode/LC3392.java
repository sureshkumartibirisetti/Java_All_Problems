package leetCode;
/*
3392. Count Subarrays of Length Three With a Condition
Example 1:
Input: nums = [1,2,1,4,1]
Output: 1
Explanation:
Only the subarray [1,4,1] contains exactly 3 elements where the sum of the first and third numbers equals half the middle number.
Example 2:
Input: nums = [1,1,1]
Output: 0
Explanation:
[1,1,1] is the only subarray of length 3. However, its first and third numbers do not add to half the middle number.
 */
public class LC3392 {
    public static void main(String[] args) {
        int[] nums={-1,-4,-1,4};
        int count=0;
        for(int i=0;i<nums.length-2;i++) {
            if(nums[i]+nums[i+2]==(nums[i+1]/2.0)){
                count++;
            }
        }
        System.out.println(count);

    }
}

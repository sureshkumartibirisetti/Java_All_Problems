package leetCode;
/*
3452. Sum of Good Numbers
Example 1:
Input: nums = [1,3,2,1,5,4], k = 2
Output: 12
Explanation:
The good numbers are nums[1] = 3, nums[4] = 5, and nums[5] = 4 because they are strictly greater than the numbers at indices i - k and i + k.
Example 2:
Input: nums = [2,1], k = 1
Output: 2
Explanation:
The only good number is nums[0] = 2 because it is strictly greater than nums[1].
 */
public class LC3452 {
    public static void main(String[] args) {
        int[] nums={1,3,2,1,5,4};
        int k=2;
        int res=0;
        for(int i=0;i<nums.length;i++){
            if(i-k>=0 && i+k<nums.length){
                if(nums[i]>nums[i-k] && nums[i]>nums[i+k]){
                    res+=nums[i];
                }
            }else if(i-k<0){
                if(nums[i]>nums[i+k]){
                    res+=nums[i];
                }
            }else{
                if(nums[i]>nums[i-k]){
                    res+=nums[i];
                }
            }
        }
        System.out.println(res);

    }
}

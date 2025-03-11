package leetCode;
/*1909. Remove One Element to Make the Array Strictly Increasing
Example 1:
Input: nums = [1,2,10,5,7]
Output: true
Explanation: By removing 10 at index 2 from nums, it becomes [1,2,5,7].
        [1,2,5,7] is strictly increasing, so return true.
Example 2:
Input: nums = [2,3,1,2]
Output: false
Explanation:
        [3,1,2] is the result of removing the element at index 0.
        [2,1,2] is the result of removing the element at index 1.
        [2,3,2] is the result of removing the element at index 2.
        [2,3,1] is the result of removing the element at index 3.
No resulting array is strictly increasing, so return false.
Example 3:
Input: nums = [1,1,1]
Output: false
Explanation: The result of removing any element is [1,1].
        [1,1] is not strictly increasing, so return false.
 */
public class LC1909 {
    public static void main(String[] args) {
        int[] nums={1,2,10,5,7};
        int c=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                continue;
            }else{
                c++;
            }
        }
        if(c>1){
            System.out.println(false);
        }
        System.out.println(true);
    }
}

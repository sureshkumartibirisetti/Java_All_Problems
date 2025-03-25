package leetCode;
/*
908. Smallest Range I
Example 1:
Input: nums = [1], k = 0
Output: 0
Explanation: The score is max(nums) - min(nums) = 1 - 1 = 0.
Example 2:
Input: nums = [0,10], k = 2
Output: 6
Explanation: Change nums to be [2, 8]. The score is max(nums) - min(nums) = 8 - 2 = 6.
Example 3:
Input: nums = [1,3,6], k = 3
Output: 0
Explanation: Change nums to be [4, 4, 4]. The score is max(nums) - min(nums) = 4 - 4 = 0.
 */
public class LC908 {
    public static void main(String[] args) {
        int[] nums={0,10,2,4,6};
        int k=2;
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i:nums){
            if(min>i){
                min=i;
            }if(max<i){
                max=i;
            }
        }
        System.out.println((max-k)-(min+k));
    }
}

package leetCode;
/*3427. Sum of Variable Length Subarrays
Example 1:
Input: nums = [2,3,1]
Output: 11
Example 2:
Input: nums = [3,1,1,2]
Output: 13
 */
public class LC3427 {
    public static void main(String[] args) {
        int[] nums={3,1,1,2};
        int res=0;
        for(int i=0;i<nums.length;i++){
            int temp=Math.max(0,i-nums[i]);
            for(int j=temp;j<=i;j++){
                res+=nums[j];
            }
        }
        System.out.println(res);
    }
}

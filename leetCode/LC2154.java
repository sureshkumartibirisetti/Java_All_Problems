package leetCode;

import java.util.Arrays;

/*2154. Keep Multiplying Found Values by Two
Example 1:
Input: nums = [5,3,6,1,12], original = 3
Output: 24
Explanation:
        - 3 is found in nums. 3 is multiplied by 2 to obtain 6.
        - 6 is found in nums. 6 is multiplied by 2 to obtain 12.
        - 12 is found in nums. 12 is multiplied by 2 to obtain 24.
        - 24 is not found in nums. Thus, 24 is returned.
Example 2:
Input: nums = [2,7,9], original = 4
Output: 4
Explanation:
        - 4 is not found in nums. Thus, 4 is returned.
 */
public class LC2154 {
    public static void main(String[] args) {
        int[] nums={2,7,9};
        int original=4;
        Arrays.sort(nums);
        for(int i:nums){
            if(i==original){
                original*=2;
            }
        }
        System.out.println(original);
    }
}

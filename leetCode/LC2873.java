package leetCode;
//2873. Maximum Value of an Ordered Triplet IExample 1:
//
//Input: nums = [12,6,1,2,7]
//Output: 77
//Explanation: The value of the triplet (0, 2, 4) is (nums[0] - nums[2]) * nums[4] = 77.
//It can be shown that there are no ordered triplets of indices with a value greater than 77.
//Example 2:
//Input: nums = [1,10,3,4,19]
//Output: 133
//Explanation: The value of the triplet (1, 2, 4) is (nums[1] - nums[2]) * nums[4] = 133.
//It can be shown that there are no ordered triplets of indices with a value greater than 133.
//Example 3:
//Input: nums = [1,2,3]
//Output: 0
//Explanation: The only ordered triplet of indices (0, 1, 2) has a negative value of (nums[0] - nums[1]) * nums[2] = -3. Hence, the answer would be 0.
public class LC2873 {
    public static void main(String[] args) {
        int[] nums = {1000000, 1, 1000000};
        long res = Long.MIN_VALUE;  // Initialize to the smallest possible value
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    long s = (long)(nums[i] - nums[j]) * nums[k];  // Calculate
                    if (s > res) {
                        res = s;  // Update the maximum result
                    }
                }
            }
        }
        System.out.println(res);
    }
}
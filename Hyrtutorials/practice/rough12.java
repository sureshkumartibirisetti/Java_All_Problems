package Hyrtutorials.practice;

import java.util.Arrays;

public class rough12 {
    public static void main(String[] args) {
        int[] nums={10,4,8,3};
        int[] left=new int[nums.length];
        int[] right=new int[nums.length];

        if(nums.length==1){
            System.out.println(Arrays.toString(new int[]{0}));
        }else{

            for(int i=0;i< nums.length;i++){

            }
        }

    }
}
//Constraints:
//
//        1 <= nums.length <= 1000
//        1 <= nums[i] <= 105
//Input: nums = [10,4,8,3]
//Output: [15,1,11,22]
//Explanation: The array leftSum is [0,10,14,22] and the array rightSum is [15,11,3,0].
//The array answer is [|0 - 15|,|10 - 11|,|14 - 3|,|22 - 0|] = [15,1,11,22].
//Example 2:
//
//Input: nums = [1]
//Output: [0]
//Explanation: The array leftSum is [0] and the array rightSum is [0].
//The array answer is [|0 - 0|] = [0].
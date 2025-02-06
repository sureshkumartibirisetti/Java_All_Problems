package leetCode;
//Input: nums = [2,1,3,5,6], k = 5, multiplier = 2
//
//Output: [8,4,6,5,6]
//
//Explanation:
//
//Operation	Result
//After operation 1	[2, 2, 3, 5, 6]
//After operation 2	[4, 2, 3, 5, 6]
//After operation 3	[4, 4, 3, 5, 6]
//After operation 4	[4, 4, 6, 5, 6]
//After operation 5	[8, 4, 6, 5, 6]

import java.util.Arrays;

public class LC3264 {
    public static void main(String[] args) {
        int[] nums={2,1,3,5,6};
        int k=5;
        int multiplier=2;
        for(int i=0;i<k;i++){
            int min=nums[0];
            int min_Index=0;
            for(int j=1;j< nums.length;j++){
                if(nums[j]<min){
                    min=nums[j];
                    min_Index=j;
                }
            }
            nums[min_Index]=nums[min_Index]*multiplier;
        }
        System.out.println(Arrays.toString(nums));
    }
}

package leetCode;

import java.sql.SQLOutput;
import java.util.Arrays;

//561. Array Partition
//Example 2:
//
//Input: nums = [6,2,6,5,1,2]
//Output: 9
//Explanation: The optimal pairing is (2, 1), (2, 5), (6, 6). min(2, 1) + min(2, 5) + min(6, 6) = 1 + 2 + 6 = 9.
public class LC561 {
    public static void main(String[] args) {
        int[] nums={6,2,6,5,1,2};
        Arrays.sort(nums);
        int i=0;
        int res=0;
        while(i<=nums.length-2){
            res+=Math.min(nums[i],nums[i+1]);
            i+=2;

        }
        System.out.println(res);
    }
}

package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
1313. Decompress Run-Length Encoded List
Example 1:
Input: nums = [1,2,3,4]
Output: [2,4,4,4]
Explanation: The first pair [1,2] means we have freq = 1 and val = 2 so we generate the array [2].
The second pair [3,4] means we have freq = 3 and val = 4 so we generate [4,4,4].
At the end the concatenation [2] + [4,4,4] is [2,4,4,4].
Example 2:
Input: nums = [1,1,2,3]
Output: [1,3,3]
 */
public class LC1313 {
    public static void main(String[] args) {
        int[] nums={1,2,3,4};
        int arrSize=0;
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length;i+=2){
            arrSize+=nums[i];

        }
        int[] res=new int[arrSize];
        int a=0;
        for(int i=0;i<nums.length;i+=2) {
            for (int j = 0; j < nums[i]; j++) {
                res[a]=nums[i+1];
                a++;
            }
        }

        System.out.println(Arrays.toString(res));
    }
}

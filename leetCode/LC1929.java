package leetCode;

import java.util.Arrays;

//1929. Concatenation of Array
//Input: nums = [1,2,1]
//Output: [1,2,1,1,2,1]
//Explanation: The array ans is formed as follows:
//        - ans = [nums[0],nums[1],nums[2],nums[0],nums[1],nums[2]]
//        - ans = [1,2,1,1,2,1]
public class LC1929 {
    public static void main(String[] args) {
        int[] nums={1,3,2,1};
        int[] res=new int[nums.length*2];
        for(int i=0;i< nums.length;i++){
            res[i]=nums[i];
            res[i+ (nums.length)]=nums[i];
        }
        System.out.println(Arrays.toString(res));
    }
}

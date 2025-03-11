package leetCode;

import java.util.Arrays;

/*
905. Sort Array By Parity
Example 1:
Input: nums = [3,1,2,4]
Output: [2,4,3,1]
Explanation: The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.
Example 2:
Input: nums = [0]
Output: [0]
 */
public class LC905 {
    public static void main(String[] args) {
        int[] nums={3,1,2,4};
        int i=0;
        int j=nums.length-1;
        int[] res=new int[nums.length];
        for(int x=0;x<nums.length;x++){
            if(nums[x]%2==0){
                res[i]=nums[x];
                i++;
            }else{
                res[j]=nums[x];
                j--;
            }
        }
        System.out.println(Arrays.toString(res));
    }
}

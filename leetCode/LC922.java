package leetCode;

import java.util.Arrays;

/*
922. Sort Array By Parity II
Example 1:
Input: nums = [4,2,5,7]
Output: [4,5,2,7]
Explanation: [4,7,2,5], [2,5,4,7], [2,7,4,5] would also have been accepted.
Example 2:
Input: nums = [2,3]
Output: [2,3]
 */
public class LC922 {
    public static void main(String[] args) {
        int[] nums={4,2,5,7};
        int[] res=new int[nums.length];
        int i=0;
        int j=1;
        for(int a=0;a<nums.length;a++){
            if(nums[a]%2==0){
                res[i]=nums[a];
                i+=2;
            }else{
                res[j]=nums[a];
                j+=2;
            }
        }
        System.out.println(Arrays.toString(res));
    }
}

package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/*
645. Set Mismatch
Example 1:
Input: nums = [1,2,2,4]
Output: [2,3]
Example 2:
Input: nums = [1,1]
Output: [1,2]
 */
public class LC645 {
    public static void main(String[] args) {
        int[] nums={2,2};
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int res1=0;
        for(int i: map.keySet()){
           res1+=i;
        }
        System.out.println(res1);
        int aa=((nums.length*(nums.length+1))/2);
//        int[] res=new int[2];
//        for(int i=0;i<nums.length-1;i++){
//            if(nums[i]==nums[i+1]){
//                if(nums[i]<nums.length){
//                    res[0]=nums[i];
//                    res[1]=nums[i]+1;
//                    break;
//                }else{
//                    res[0]=nums[i];
//                    res[1]=nums[i]-1;
//                    break;
//                }
//            }
//        }
        System.out.println(aa);
    }
}

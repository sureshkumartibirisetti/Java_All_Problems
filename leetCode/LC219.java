package leetCode;

import java.util.HashMap;

/*
219. Contains Duplicate II
Example 1:
Input: nums = [1,2,3,1], k = 3
Output: true
Example 2:
Input: nums = [1,0,1,1], k = 1
Output: true
Example 3:
Input: nums = [1,2,3,1,2,3], k = 2
Output: false
 */
public class LC219 {
    public static void main(String[] args) {
        int[] nums={1,2,3,1};
        int k=1;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int i=0;i<nums.length;i++){
            if(map.get(nums[i])>1){
                for(int j=i+1;j< nums.length;j++){
                    if(nums[i]==nums[j] && Math.abs(i-j)<=k){
                        System.out.println(true);
                    }
                }
            }
        }
        System.out.println(false);
    }
}

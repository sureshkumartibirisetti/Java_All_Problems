package leetCode;

import java.util.Arrays;
import java.util.HashMap;

/*
594. Longest Harmonious Subsequence
Example 1:
Input: nums = [1,3,2,2,5,2,3,7]
Output: 5
Explanation:
The longest harmonious subsequence is [3,2,2,2,3].
Example 2:
Input: nums = [1,2,3,4]
Output: 2
Explanation:
The longest harmonious subsequences are [1,2], [2,3], and [3,4], all of which have a length of 2.
Example 3:
Input: nums = [1,1,1,1]
Output: 0
Explanation:
No harmonic subsequence exists.
 */
public class LC594 {
    public static void main(String[] args) {
        int[] nums={1,1,1,1};
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i :nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        Arrays.sort(nums);
        int res=0;
        int l=0;
        int r=0;
        while(r!=nums.length){
            if(nums[l]==nums[r]){
                r++;
            } else if (nums[r]-nums[l]!=1) {
                l=r;
                r=l+1;
            }else{
                int a=map.get(nums[l]);
                int b=map.get(nums[r]);
                if(res<(a+b)){
                    res=a+b;
                }
                l=r;
                r=l+1;
            }
        }
        System.out.println(res);

    }
}

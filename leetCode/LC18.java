package leetCode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
18. 4Sum
Example 1:
Input: nums = [1,0,-1,0,-2,2], target = 0
Output: [[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]
Example 2:
Input: nums = [2,2,2,2,2], target = 8
Output: [[2,2,2,2]]
 */
public class LC18 {
    public static void main(String[] args) {
        int[] nums={1,-2,-5,-4,-3,3,3,5};
        int target=-11;
        Arrays.sort(nums);
        Set<List<Integer>> set=new HashSet<>();
        for(int i=0;i<nums.length-3;i++){
            for(int j=i+1;j<nums.length-2;j++){
                if(target>(nums[i]+nums[j])){
                    for(int k=j+1;k<nums.length-1;k++){
                        if(target>(nums[i]+nums[j]+nums[k])){
                            for(int l=k+1;l<nums.length;l++){
                                if(target==(nums[i]+nums[j]+nums[k]+nums[l])){
                                    List<Integer> list=Arrays.asList(nums[i],nums[j],nums[k],nums[l]);
                                    set.add(list);
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println(set);
    }
}

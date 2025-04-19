package leetCode;

import java.util.HashMap;

/*
287. Find the Duplicate Number
Example 1:
Input: nums = [1,3,4,2,2]
Output: 2
Example 2:
Input: nums = [3,1,3,4,2]
Output: 3
Example 3:
Input: nums = [3,3,3,3,3]
Output: 3
 */
public class LC287 {
    public static void main(String[] args) {
        int[] nums={3,3,3,3,3};
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int res=0;
        for(int i:map.keySet()){
            if(map.get(i)>=2){
                res=i;
                break;
            }
        }
    }
}

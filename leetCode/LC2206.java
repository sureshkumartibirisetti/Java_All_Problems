package leetCode;

import java.util.HashMap;

/*
2206. Divide Array Into Equal Pairs

Example 1:
Input: nums = [3,2,3,2,2,2]
Output: true
Explanation:
There are 6 elements in nums, so they should be divided into 6 / 2 = 3 pairs.
If nums is divided into the pairs (2, 2), (3, 3), and (2, 2), it will satisfy all the conditions.
Example 2:
Input: nums = [1,2,3,4]
Output: false
Explanation:
There is no way to divide nums into 4 / 2 = 2 pairs such that the pairs satisfy every condition.
*/
public class LC2206 {
    public static void main(String[] args) {
        int[] nums={3,2,3,2,2,2};
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int i:map.values()){
            if(i%2==0){
                continue;
            }else{
                break;
            }
        }
    }
}

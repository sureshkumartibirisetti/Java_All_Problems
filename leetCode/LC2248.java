package leetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;

/*
2248. Intersection of Multiple Arrays
Example 1:
Input: nums = [[3,1,2,4,5],[1,2,3,4],[3,4,5,6]]
Output: [3,4]
Explanation:
The only integers present in each of nums[0] = [3,1,2,4,5], nums[1] = [1,2,3,4], and nums[2] = [3,4,5,6] are 3 and 4, so we return [3,4].
Example 2:
Input: nums = [[1,2,3],[4,5,6]]
Output: []
Explanation:
There does not exist any integer present both in nums[0] and nums[1], so we return an empty list [].
 */
public class LC2248 {
    public static void main(String[] args) {
        int[][] nums={{3,1,2,4,5},{1,2,3,4},{3,4,5,6}};
        TreeMap<Integer,Integer> map=new TreeMap<>();
        List<Integer> list=new ArrayList<>();
        for(int[] i:nums){
            for(int j:i){
                map.put(j,map.getOrDefault(j,0)+1);
            }
        }
        for(int i: map.keySet()){
            if(map.get(i)== nums.length){
                list.add(i);
            }
        }
        System.out.println(list);

    }
}

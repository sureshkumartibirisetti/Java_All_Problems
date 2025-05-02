package leetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/*
2032. Two Out of Three
Example 1:
Input: nums1 = [1,1,3,2], nums2 = [2,3], nums3 = [3]
Output: [3,2]
Explanation: The values that are present in at least two arrays are:
- 3, in all three arrays.
- 2, in nums1 and nums2.
Example 2:
Input: nums1 = [3,1], nums2 = [2,3], nums3 = [1,2]
Output: [2,3,1]
Explanation: The values that are present in at least two arrays are:
- 2, in nums2 and nums3.
- 3, in nums1 and nums2.
- 1, in nums1 and nums3.
Example 3:
Input: nums1 = [1,2,2], nums2 = [4,3,3], nums3 = [5]
Output: []
Explanation: No value is present in at least two  arrays.
 */
public class LC2032 {
    public static void main(String[] args) {
        int[] nums1={1,1,3,2};
        int[] nums2={2,3};
        int[] nums3={3};
        ArrayList<Integer> res=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2=new HashSet<>();
        HashSet<Integer> set3=new HashSet<>();
        for(int i:nums1){
            set1.add(i);
        }
        for(int i:nums2){
            set2.add(i);
        }
        for(int i:nums3){
            set3.add(i);
        }
        for(int i:set1){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int i:set2){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int i:set3){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int i:map.keySet()){
            if(map.get(i)>=2){
                res.add(i);
            }
        }
        System.out.println(res);
    }
}

package leetCode;

import java.util.HashMap;
import java.util.TreeMap;

/*2441. Largest Positive Integer That Exists With Its Negative
Example 1:
Input: nums = [-1,2,-3,3]
Output: 3
Explanation: 3 is the only valid k we can find in the array.
        Example 2:
Input: nums = [-1,10,6,7,-7,1]
Output: 7
Explanation: Both 1 and 7 have their corresponding negative values in the array. 7 has a larger value.
Example 3:
Input: nums = [-10,8,6,7,-2,-3]
Output: -1
Explanation: There is no a single valid k, we return -1.
 */
public class LC2441 {
    public static void main(String[] args) {
        int[] nums={-10,8,6,7,-2,-3,-100,-200,-300,400,451,300};
        TreeMap<Integer,Integer> map=new TreeMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int i: map.descendingKeySet()){
            if(map.containsKey(i*-1) && i>0){
                System.out.println(i);
            }
        }

    }
}

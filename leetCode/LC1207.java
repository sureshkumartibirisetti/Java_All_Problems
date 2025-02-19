package leetCode;

import java.util.HashMap;
import java.util.HashSet;

/*
1207. Unique Number of Occurrences
Example 1:
Input: arr = [1,2,2,1,1,3]
Output: true
Explanation: The value 1 has 3 occurrences, 2 has 2 and 3 has 1. No two values have the same number of occurrences.
Example 2:
Input: arr = [1,2]
Output: false
Example 3:
Input: arr = [-3,0,1,-3,1,1,1,-3,10,0]
Output: true
 */
public class LC1207 {
    public static void main(String[] args) {
        int[] arr={-3,0,1,-3,1,1,1,-3,10,0};
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i:arr){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        HashSet<Integer> hs=new HashSet<>();
        for(int i: hm.values()){
            hs.add(i);
        }
        if(hs.size()== hm.size()){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }
}

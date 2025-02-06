package leetCode;

import java.util.Arrays;
import java.util.HashMap;

//3158. Find the XOR of Numbers Which Appear Twice
//Input:nums = [1,2,1,3]
//Output: 1
//Explanation:
//The only number that appears twice in nums is 1.
//Input: nums = [1,2,3]
//Output: 0
//Explanation:
//No number appears twice in nums.
public class LC3158 {
    public static void main(String[] args) {
        int[] nums={1,2,1,3,2};
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i:nums){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }

        int a1=0;
        for(int j: hm.keySet()){
            int a=hm.get(j);
            if(a>1){
                a1^=j;
            }
        }
        System.out.println(a1);
    }
}

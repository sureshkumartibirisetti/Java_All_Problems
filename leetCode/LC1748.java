package leetCode;
//1748. Sum of Unique Elements
//        Example 1:
//
//        Input: nums = [1,2,3,2]
//        Output: 4
//        Explanation: The unique elements are [1,3], and the sum is 4.
//        Example 2:
//
//        Input: nums = [1,1,1,1,1]
//        Output: 0
//        Explanation: There are no unique elements, and the sum is 0.
//        Example 3:
//
//        Input: nums = [1,2,3,4,5]
//        Output: 15
//        Explanation: The unique elements are [1,2,3,4,5], and the sum is 15.
import java.util.HashMap;
import java.util.HashSet;

public class LC1748 {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5};
        int res=0;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i:nums){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        for(int i: hm.keySet()){
            int s=hm.get(i);
            if(s==1){
                res+=i;
            }
        }
        System.out.println(res);
    }
}

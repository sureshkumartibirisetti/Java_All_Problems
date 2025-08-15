package leetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/*
448. Find All Numbers Disappeared in an Array
Example 1:
Input: nums = [4,3,2,7,8,2,3,1]
Output: [5,6]
Example 2:
Input: nums = [1,1]
Output: [2]
 */
public class LC448 {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,4};
        List<Integer> list=new ArrayList<>();
        HashSet<Integer> set=new HashSet<>();
        for(int i:nums){
            set.add(i);
        }
        int m=nums.length-set.size();
        for(int i=1;i<= nums.length;i++){
            if(list.size()==m){
                break;
            }else if(!set.contains(i)){
                list.add(i);
            }
        }
        System.out.println(list);

    }
}

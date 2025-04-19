package leetCode;

import java.util.HashSet;

/*
3375. Minimum Operations to Make Array Values Equal to K
Example 1:
Input: nums = [5,2,5,4,5], k = 2
Output: 2
Explanation:
The operations can be performed in order using valid integers 4 and then 2.
Example 2:
Input: nums = [2,1,2], k = 2
Output: -1
Explanation:
It is impossible to make all the values equal to 2.
Example 3:
Input: nums = [9,7,5,3], k = 1
Output: 4
Explanation:
The operations can be performed using valid integers in the order 7, 5, 3, and 1
 */
public class LC3375 {
    public static void main(String[] args) {
        int[] nums={5,2,5,4,5};
        int k=2;
        HashSet<Integer> set=new HashSet<>();
        for(int i:nums){
            if(i>k){
                set.add(i);
            }else if(i<k){
                System.out.println(-1);
            }
        }
        System.out.println(set.size());
    }
}

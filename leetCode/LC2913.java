package leetCode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

//2913. Subarrays Distinct Element Sum of Squares I
//Example 1:
//Input: nums = [1,2,1]
//Output: 15
//Explanation: Six possible subarrays are:
//        [1]: 1 distinct value
//[2]: 1 distinct value
//[1]: 1 distinct value
//[1,2]: 2 distinct values
//[2,1]: 2 distinct values
//[1,2,1]: 2 distinct values
//The sum of the squares of the distinct counts in all subarrays is equal to 12 + 12 + 12 + 22 + 22 + 22 = 15.
//Example 2:
//Input: nums = [1,1]
//Output: 3
//Explanation: Three possible subarrays are:
//        [1]: 1 distinct value
//[1]: 1 distinct value
//[1,1]: 1 distinct value
//The sum of the squares of the distinct counts in all subarrays is equal to 12 + 12 + 12 = 3.
public class LC2913 {
    public static void main(String[] args) {
        List<Integer> nums=new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(1);
        int res=0;
        for(int i=0;i<nums.size();i++){
            HashSet<Integer> hs=new HashSet<>();
            for(int j=i;j<nums.size();j++){
                hs.add(nums.get(j));
                int a=hs.size();
                res+=(a*a);
            }
        }
        System.out.println(res);
    }
}

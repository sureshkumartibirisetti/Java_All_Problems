package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
78. Subsets
Example 1:
Input: nums = [1,2,3]
Output: [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]
Example 2:
Input: nums = [0]
Output: [[],[0]]
 */
public class LC78 {
    public static void main(String[] args) {
        int[] nums={1,2,3};
        List<List<Integer>> res=new ArrayList<>();
        int n=(int)Math.pow(2,nums.length);
        for(int i=0;i< n;i++){

            String b = String.format("%"+nums.length+"s", Integer.toBinaryString(i)).replace(' ', '0');
            System.out.println(b);
            List<Integer> list=new ArrayList<>();
            for(int j=0;j<b.length();j++){
                if(b.charAt(j)!='0'){
                    list.add(nums[j]);
                }
            }
            res.add(list);
        }
        System.out.println(res);
    }
}

package leetCode;

import java.util.Arrays;

/*
2389. Longest Subsequence With Limited Sum
Example 1:
Input: nums = [4,5,2,1], queries = [3,10,21]
Output: [2,3,4]
Explanation: We answer the queries as follows:
- The subsequence [2,1] has a sum less than or equal to 3. It can be proven that 2 is the maximum size of such a subsequence, so answer[0] = 2.
- The subsequence [4,5,1] has a sum less than or equal to 10. It can be proven that 3 is the maximum size of such a subsequence, so answer[1] = 3.
- The subsequence [4,5,2,1] has a sum less than or equal to 21. It can be proven that 4 is the maximum size of such a subsequence, so answer[2] = 4.
Example 2:
Input: nums = [2,3,4,5], queries = [1]
Output: [0]
Explanation: The empty subsequence is the only subsequence that has a sum less than or equal to 1, so answer[0] = 0.
 */
public class LC2389 {
    public static void main(String[] args) {
        int[] nums={2,3,4,5};
        int[] queries={1};
        int[] res=new int[queries.length];
        Arrays.sort(nums);
        for(int i=0;i<queries.length;i++){
            int temp=0;
            int ress=0;
            for(int j=0;j<nums.length;j++){
                temp+=nums[j];
                if(queries[i]>=temp){
                    ress++;
                }else{
                    res[i]=ress;
                    break;
                }
                if(j== nums.length-1 && queries[i]>=temp){
                    res[i]=ress;
                }
            }
        }
        System.out.println(Arrays.toString(res));
    }
}

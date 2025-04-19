package leetCode;
/*
2563. Count the Number of Fair Pairs
Example 1:
Input: nums = [0,1,7,4,4,5], lower = 3, upper = 6
Output: 6
Explanation: There are 6 fair pairs: (0,3), (0,4), (0,5), (1,3), (1,4), and (1,5).
Example 2:
Input: nums = [1,7,9,2,5], lower = 11, upper = 11
Output: 1
Explanation: There is a single fair pair: (2,3).
 */
public class LC2563 {
    public static void main(String[] args) {
        int[] nums={1,7,9,2,5};
        int lower=11;
        int upper=11;
        long res=0;
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                long a= nums[i]+nums[j];
                if(a>=lower && upper>=a){
                    res++;
                }
            }
        }
        System.out.println(res);
    }
}

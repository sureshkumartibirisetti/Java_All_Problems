package leetCode;
/*
3201. Find the Maximum Length of Valid Subsequence I
You are given an integer array nums.
A subsequence sub of nums with length x is called valid if it satisfies:
(sub[0] + sub[1]) % 2 == (sub[1] + sub[2]) % 2 == ... == (sub[x - 2] + sub[x - 1]) % 2.
Return the length of the longest valid subsequence of nums.
A subsequence is an array that can be derived from another array by deleting some or no elements without changing the order of the remaining elements.
Example 1:
Input: nums = [1,2,3,4]
Output: 4
Explanation:
The longest valid subsequence is [1, 2, 3, 4].
Example 2:
Input: nums = [1,2,1,1,2,1,2]
Output: 6
Explanation:
The longest valid subsequence is [1, 2, 1, 2, 1, 2].
Example 3:
Input: nums = [1,3]
Output: 2
Explanation:
The longest valid subsequence is [1, 3].
 */
public class LC3201 {
    public static void main(String[] args) {
        int[] nums={1,3};
        int res=0;
        int res2=0;
        int res3=0;
        int res4=0;
        int t=0;
        int t1=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0 && t==0){
                res++;
                t++;
            } else if(nums[i]%2!=0 && t==1) {
                res++;
                t--;
            }
            if(nums[i]%2!=0 && t1==0){
                res2++;
                t1++;
            } else if(nums[i]%2==0 && t1==1) {
                res2++;
                t1--;
            }
            if(nums[i]%2==0){
                res3++;
            }
            if(nums[i]%2!=0){
                res4++;
            }
        }
        int Ores1=Math.max(res3,res4);
        int Ores=Math.max(res,res2);
        System.out.println(Math.max(Ores,Ores1));

    }
}

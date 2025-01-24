package leetCode;
//Input: nums = [1,2,2,1], k = 1
//Output: 4
//Explanation: The pairs with an absolute difference of 1 are:
//        - [1,2,2,1]
//        - [1,2,2,1]
//        - [1,2,2,1]
//        - [1,2,2,1]
//Example 2:
public class LC2006 {
    public static void main(String[] args) {
        int[] nums={1,2,2,1};
        int k=1;
        int res=0;
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(Math.abs(nums[i]-nums[j])==k){
                    res++;
                }
            }
        }
        System.out.println(res);
    }
}

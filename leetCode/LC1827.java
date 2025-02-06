package leetCode;
//1827. Minimum Operations to Make the Array Increasing
//Input: nums = [1,1,1]
//Output: 3
//Explanation: You can do the following operations:
//        1) Increment nums[2], so nums becomes [1,1,2].
//        2) Increment nums[1], so nums becomes [1,2,2].
//        3) Increment nums[2], so nums becomes [1,2,3].
public class LC1827 {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,1};
        int res=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                continue;
            }
            else{
                int temp=nums[i];
                nums[i]=nums[i-1]+1;
                res+=nums[i]-temp;
            }
        }
        System.out.println(res);
    }
}

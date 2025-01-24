package leetCode;
//Input: nums = [5,6,2,7,4]
//Output: 34
//Explanation: We can choose indices 1 and 3 for the first pair (6, 7) and indices 2 and 4 for the second pair (2, 4).
//The product difference is (6 * 7) - (2 * 4) = 34.
public class LC1913 {
    public static void main(String[] args) {
        int[] nums={5,6,2,7,4};
        int max1=nums[0];
        int max2=-1;
        int min1=nums[0];
        int min2=Integer.MAX_VALUE;
        for(int i=1;i< nums.length;i++){
            if(max1<=nums[i]){
                max2=max1;
                max1=nums[i];
            }else{
                if(nums[i]>max2){
                    max2=nums[i];
                }
            }if(min1>=nums[i]){
                min2=min1;
                min1=nums[i];
            }else{
                if(nums[i]<min2){
                    min2=nums[i];
                }
            }
        }
        System.out.println((max1*max2)-(min2*min1));
    }
}

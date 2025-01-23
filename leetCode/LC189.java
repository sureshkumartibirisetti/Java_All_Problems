package leetCode;

import java.util.Arrays;

//Input: nums = [1,2,3,4,5,6,7], k = 3
//Output: [5,6,7,1,2,3,4]
//Explanation:
//rotate 1 steps to the right: [7,1,2,3,4,5,6]
//rotate 2 steps to the right: [6,7,1,2,3,4,5]
//rotate 3 steps to the right: [5,6,7,1,2,3,4]
public class LC189 {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6,7};
        int l=nums.length;
        int k=3;
        for(int i=0;i<k;i++){
            int x=nums[0];
            for(int j=0;j<l-1;j++){
                nums[j]=nums[j+1];
            }
            nums[l-1]=x;
        }
        System.out.println(Arrays.toString(nums));
    }

}
//for(int i=0;i<k;i++){
//        int x=nums[l-1];
//            for(int j=l-1;j>0;j--){
//        nums[j]=nums[j-1];
//        }
//        nums[0]=x;

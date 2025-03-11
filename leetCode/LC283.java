package leetCode;

import java.util.Arrays;

//Input: nums = [0,1,0,3,12]
//Output: [1,3,12,0,0]
public class LC283 {
    public static void main(String[] args) {
        int[] nums={0,0,1,2,3,0,0,3,4,5,1,0};
        int j=0;
        int[] arr=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                arr[j]=nums[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(arr));

    }
}

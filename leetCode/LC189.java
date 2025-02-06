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
        int k=8;
        int a=k%l;
        reverse(nums,0,l-1);
        reverse(nums,0,a-1);
        reverse(nums,a,l-1);
        System.out.println(Arrays.toString(nums));

    }
    static void reverse(int[] arr,int l,int r){
        while(l<r){
            int temp=arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
            l++;
            r--;
        }
    }

}
//for(int i=0;i<k;i++){
//        int x=nums[l-1];
//            for(int j=l-1;j>0;j--){
//        nums[j]=nums[j-1];
//        }
//        nums[0]=x;

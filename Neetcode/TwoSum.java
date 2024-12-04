package Neetcode;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums={4,5,6};
        int t=10;
        int[] arr=new int[2];
        s:
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==t){
                    arr[0]=i;
                    arr[1]=j;
                    break s;
                }
            }
        }
        System.out.println(Arrays.toString(arr));

    }
}

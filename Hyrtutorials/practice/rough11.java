package Hyrtutorials.practice;

import java.util.Arrays;

public class rough11 {
    public static void main(String[] args) {
        int[] nums={7,8,3,4,15,13,4,1};
        Arrays.sort(nums);
        double res=Integer.MAX_VALUE;
        int l=0;
        int h=nums.length-1;
        while(l<h){
            double a=(double) (nums[l]+nums[h])/2;
            if(res>a){
                res=a;
            }
            l++;
            h--;
        }
        System.out.println(res);
    }
}

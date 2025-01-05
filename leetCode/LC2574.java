package leetCode;

import java.lang.reflect.Array;
import java.util.Arrays;

public class LC2574 {
    public static void main(String[] args) {
        int[]  nums={1,2,3};
        int[] leftNums=new int[nums.length];
        int[] rightNums=new int[nums.length];
        int[] res=new int[nums.length];
        leftNums[0]=0;
        rightNums[nums.length-1]=0;
        for(int i=1;i<nums.length;i++){
            leftNums[i]=nums[i-1]+leftNums[i-1];
        }
        for(int i=nums.length-2;i>=0;i--){
            rightNums[i]=nums[i+1]+rightNums[i+1];
        }
        for(int i=0;i<nums.length;i++){
            res[i]=Math.abs(leftNums[i]-rightNums[i]);
        }
        System.out.println(Arrays.toString(res));
    }
}

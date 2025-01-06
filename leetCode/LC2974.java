package leetCode;

import java.util.Arrays;

public class LC2974 {
    public static void main(String[] args) {
        int[] nums={5,4,2,3}; //2345
        Arrays.sort(nums);
        int[] res=new int[nums.length];
        for(int i=1;i<nums.length;i+=2){
            res[i-1]=nums[i];
            res[i]=nums[i-1];
        }
        System.out.println(Arrays.toString(res));
    }
}

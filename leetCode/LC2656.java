package leetCode;

import java.util.Arrays;

//2656. Maximum Sum With Exactly K Elements
//Input: nums = [1,2,3,4,5], k = 3
//Output: 18
public class LC2656 {
    public static void main(String[] args) {
        int[] nums={5,5,5};
        int k=2;
        int s= Arrays.stream(nums).max().getAsInt();
        int sum=0;
        for(int i=s;i<s+k;i++){
            sum=sum+i;
        }
        System.out.println(sum);


    }
}

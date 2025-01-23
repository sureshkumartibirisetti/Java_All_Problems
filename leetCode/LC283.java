package leetCode;

import java.util.Arrays;

//Input: nums = [0,1,0,3,12]
//Output: [1,3,12,0,0]
public class LC283 {
    public static void main(String[] args) {
        int[] nums={0,0,1,2,3,0,0,3,4,5,1,0};
        int l=0;
        int h=0;
        int s=0;
        if(nums.length<=1){
            System.out.println(Arrays.toString(nums));
        }else {
            for (int i = 0; i < nums.length - s; i++) {
                if (nums[i] == 0 && nums[i + 1] != 0) {
                    s++;
                    int temp = nums[i];
                    nums[i] = nums[i + 1];
                    nums[i + 1] = temp;
                } else if (nums[i] == 0 && nums[i + 1] == 0) {
                    int temp = nums[i];
                    nums[i] = nums[i + 2];
                    nums[i + 2] = temp;
                    s++;
                }
            }
            System.out.println(Arrays.toString(nums));
        }

    }
}

package leetCode;

import java.util.Arrays;
import java.util.HashSet;

public class LC3289 {
    public static void main(String[] args) {
        int[] nums={7,1,5,4,3,4,6,0,9,5,8,2};
        HashSet<Integer> arr=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            int count=0;
            for(int j=0;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
            if(count==2){
                arr.add(nums[i]);
            }
        }
        int[] res=new int[2];
        int i=0;
        for(int j:arr){
            res[i]=j;
            i++;
        }
        System.out.println(Arrays.toString(res));

    }
}

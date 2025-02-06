package leetCode;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC2149 {
    public static void main(String[] args) {
        int[] nums={1,2,3,-1,-2,-3};
        int[] result = new int[nums.length];
        int p = 0, q = 1;

        for (int num : nums) {
            if (num > 0) {
                result[p] = num;
                p += 2;
            } else {
                result[q] = num;
                q += 2;
            }
        }

        System.out.println(Arrays.toString(result));
    }

}



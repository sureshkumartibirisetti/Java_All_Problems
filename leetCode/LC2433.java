package leetCode;

import java.util.Arrays;

/*
2433. Find The Original Array of Prefix Xor
Example 1:
Input: pref = [5,2,0,3,1]
Output: [5,7,2,3,2]
Explanation: From the array [5,7,2,3,2] we have the following:
- pref[0] = 5.
- pref[1] = 5 ^ 7 = 2.
- pref[2] = 5 ^ 7 ^ 2 = 0.
- pref[3] = 5 ^ 7 ^ 2 ^ 3 = 3.
- pref[4] = 5 ^ 7 ^ 2 ^ 3 ^ 2 = 1.
Example 2:
Input: pref = [13]
Output: [13]
Explanation: We have pref[0] = arr[0] = 13.
 */
public class LC2433 {
    public static void main(String[] args) {
        int[] pref={13};
        int[] res=new int[pref.length];
        res[0]=pref[0];
        for(int i=1;i<pref.length;i++){
            res[i]=pref[i]^pref[i-1];
        }
        System.out.println(Arrays.toString(res));
    }
}

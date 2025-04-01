package leetCode;

import java.util.Arrays;

/*
1720. Decode XORed Array
Example 1:
Input: encoded = [1,2,3], first = 1
Output: [1,0,2,1]
Explanation: If arr = [1,0,2,1], then first = 1 and encoded = [1 XOR 0, 0 XOR 2, 2 XOR 1] = [1,2,3]
Example 2:
Input: encoded = [6,2,7,3], first = 4
Output: [4,2,0,7,4]
 */
public class LC1720 {
    public static void main(String[] args) {
        int[] encoded={6,2,7,3};
        int first=4;
        int[] res=new int[encoded.length+1];
        res[0]=first;
        for(int i=0;i<encoded.length;i++){
            res[i+1]=res[i]^encoded[i];
        }
        System.out.println(Arrays.toString(res));
    }
}

package Striver.DSA.a2z.Step_1_Basic;

import java.util.Arrays;
import java.util.HashMap;

/*Find the highest/lowest frequency element
Example 1:
Input: array[] = {10,5,10,15,10,5};
Output: 10 15
Explanation: The frequency of 10 is 3, i.e. the highest and the frequency of 15 is 1 i.e. the lowest.
Example 2:
Input: array[] = {2,2,3,4,4,2};
Output: 2 3
Explanation: The frequency of 2 is 3, i.e. the highest and the frequency of 3 is 1 i.e. the lowest.
 */
public class L6_3_HighestFreq {
    public static void main(String[] args) {
        int[] arr={2,2,3,4,4,2};
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        System.out.println(map);
        int max=0;
        int min_value=0;
        int max_value=0;
        int min=Integer.MAX_VALUE;
        for(int i:map.keySet()){
            if(map.get(i)<min){
                min_value=i;
                min=map.get(i);
            }if(max<map.get(i)){
                max=map.get(i);
                max_value=i;
            }
        }
        System.out.println(Arrays.toString(new int[]{max_value,min_value}));
    }
}

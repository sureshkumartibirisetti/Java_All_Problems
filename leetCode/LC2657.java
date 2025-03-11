package leetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
2657. Find the Prefix Common Array of Two Arrays
Example 1:
Input: A = [1,3,2,4], B = [3,1,2,4]
Output: [0,2,3,4]
Explanation: At i = 0: no number is common, so C[0] = 0.
At i = 1: 1 and 3 are common in A and B, so C[1] = 2.
At i = 2: 1, 2, and 3 are common in A and B, so C[2] = 3.
At i = 3: 1, 2, 3, and 4 are common in A and B, so C[3] = 4.
Example 2:
Input: A = [2,3,1], B = [3,1,2]
Output: [0,1,3]
Explanation: At i = 0: no number is common, so C[0] = 0.
At i = 1: only 3 is common in A and B, so C[1] = 1.
At i = 2: 1, 2, and 3 are common in A and B, so C[2] = 3.
 */
public class LC2657 {
    public static void main(String[] args) {
        int[] a={2,3,1};
        int[] b={3,1,2};
        int[] res=new int[a.length];
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<a.length;i++){
            map.put(a[i],map.getOrDefault(a[i],0)+1);
            map.put(b[i],map.getOrDefault(b[i],0)+1);
            res[i]=count(map);
        }
        System.out.println(Arrays.toString(res));
    }
    public static int count(HashMap<Integer,Integer> map){
        int res=0;
        for(int i:map.values()){
            if(i>1){
                res++;
            }
        }
        return res;
    }
}

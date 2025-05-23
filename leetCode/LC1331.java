package leetCode;

import java.util.Arrays;
import java.util.TreeMap;

/*
1331. Rank Transform of an Array
Example 1:
Input: arr = [40,10,20,30]
Output: [4,1,2,3]
Explanation: 40 is the largest element. 10 is the smallest. 20 is the second smallest. 30 is the third smallest.
Example 2:
Input: arr = [100,100,100]
Output: [1,1,1]
Explanation: Same elements share the same rank.
Example 3:
Input: arr = [37,12,28,9,100,56,80,5,12]
Output: [5,3,4,2,8,6,7,1,3]
 */
public class LC1331 {
    public static void main(String[] args) {
         int[] arr={37,12,28,9,100,56,80,5,12};
         int[] res=new int[arr.length];
        TreeMap<Integer,Integer> treemap=new TreeMap<>();
        for(int i:arr){
            treemap.put(i,treemap.getOrDefault(i,0)+1);
        }
        int a=1;
        for(int i:treemap.keySet()){
            treemap.put(i,a);
            a++;
        }
        for(int i=0;i<res.length;i++){
            res[i]=treemap.get(arr[i]);
        }
        System.out.println(Arrays.toString(res));

    }
}

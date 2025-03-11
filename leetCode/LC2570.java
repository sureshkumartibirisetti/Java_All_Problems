package leetCode;

import java.util.Arrays;
import java.util.HashMap;

/*2570. Merge Two 2D Arrays by Summing Values
Example 1:
Input: nums1 = [[1,2],[2,3],[4,5]], nums2 = [[1,4],[3,2],[4,1]]
Output: [[1,6],[2,3],[3,2],[4,6]]
Explanation: The resulting array contains the following:
        - id = 1, the value of this id is 2 + 4 = 6.
        - id = 2, the value of this id is 3.
        - id = 3, the value of this id is 2.
        - id = 4, the value of this id is 5 + 1 = 6.
Example 2:
Input: nums1 = [[2,4],[3,6],[5,5]], nums2 = [[1,3],[4,3]]
Output: [[1,3],[2,4],[3,6],[4,3],[5,5]]
Explanation: There are no common ids, so we just include each id with its value in the resulting list.
 */
public class LC2570 {
    public static void main(String[] args) {
        int[][] nums1={{2,4},{3,6},{5,5}};
        int[][] nums2={{1,3},{4,3}};
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int[] i:nums1){
            map.put(i[0],map.getOrDefault(i[0],0)+i[1]);
        }
        for(int[] i:nums2){
            map.put(i[0],map.getOrDefault(i[0],0)+i[1]);
        }
        int[][] res=new int[map.size()][];
        int j=0;
        for(int i:map.keySet()){
            res[j]=new int[]{i,map.get(i)};
            j++;
        }
        System.out.println(Arrays.deepToString(res));

    }
}

package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
1200. Minimum Absolute Difference
Example 1:
Input: arr = [4,2,1,3]
Output: [[1,2],[2,3],[3,4]]
Explanation: The minimum absolute difference is 1. List all pairs with difference equal to 1 in ascending order.
Example 2:
Input: arr = [1,3,6,10,15]
Output: [[1,3]]
Example 3:
Input: arr = [3,8,-10,23,19,-4,-14,27]
Output: [[-14,-10],[19,23],[23,27]]
 */
public class LC1200 {
    public static void main(String[] args) {
        int[] arr={3,8,-10,23,19,-4,-14,27};
        Arrays.sort(arr);
        int min=Integer.MAX_VALUE;
        List<List<Integer>> list=new ArrayList<>();
        for(int i=1;i<arr.length;i++){
            if(min>arr[i]-arr[i-1]){
                min=arr[i]-arr[i-1];
            }
        }
        for(int i=1;i<arr.length;i++){
            List<Integer> l1=new ArrayList<>();
            if(arr[i]-arr[i-1]==min){
                l1.add(arr[i-1]);
                l1.add(arr[i]);
                list.add(l1);
            }

        }
        System.out.println(list);
    }
}

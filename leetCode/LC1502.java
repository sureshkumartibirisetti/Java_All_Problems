package leetCode;

import java.util.Arrays;

/*
1502. Can Make Arithmetic Progression From Sequence
Example 1:
Input: arr = [3,5,1]
Output: true
Explanation: We can reorder the elements as [1,3,5] or [5,3,1] with differences 2 and -2 respectively, between each consecutive elements.
Example 2:
Input: arr = [1,2,4]
Output: false
Explanation: There is no way to reorder the elements to obtain an arithmetic progression.
 */
public class LC1502 {
    public static void main(String[] args) {
        int[] arr={3,5,1};
        Arrays.sort(arr);
        int a=arr[1]-arr[0];
        for(int i=0;i<arr.length-1;i++){
            if(a!=arr[i+1]-arr[i]){
                System.out.println(false);
            }
        }
        System.out.println(true);
    }
}

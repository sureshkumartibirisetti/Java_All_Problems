package leetCode;

import java.util.Arrays;

/*
3074. Apple Redistribution into Boxes
Example 1:
Input: apple = [1,3,2], capacity = [4,3,1,5,2]
Output: 2
Explanation: We will use boxes with capacities 4 and 5.
It is possible to distribute the apples as the total capacity is greater than or equal to the total number of apples.
Example 2:
Input: apple = [5,5,5], capacity = [2,4,2,7]
Output: 4
Explanation: We will need to use all the boxes.
 */
public class LC3074 {
    public static void main(String[] args) {
        int[] apple={5,5,5};
        int[] capacity={2,4,2,7};
        int total_apple=0;
        for(int i:apple){
            total_apple+=i;
        }
        int res=0;
        int temp=0;
        Arrays.sort(capacity);
        for(int i=capacity.length-1;i>=0;i--){
            temp+=capacity[i];
            res++;
            if(total_apple<=temp){
                break;
            }

        }
        System.out.println(res);
    }
}

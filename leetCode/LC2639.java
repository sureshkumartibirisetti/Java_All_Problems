package leetCode;

import java.util.Arrays;
import java.util.HashMap;

/*
2639. Find the Width of Columns of a Grid
Example 1:
Input: grid = [[1],[22],[333]]
Output: [3]
Explanation: In the 0th column, 333 is of length 3.
Example 2:
Input: grid = [[-15,1,3],[15,7,12],[5,6,-2]]
Output: [3,1,2]
Explanation:
In the 0th column, only -15 is of length 3.
In the 1st column, all integers are of length 1.
In the 2nd column, both 12 and -2 are of length 2.
 */
public class LC2639 {
    public static void main(String[] args) {
        int[][] grid={{1},{22},{333}};
        int[] res=new int[grid[0].length];
        for(int i=0;i< grid[0].length;i++){
            int temp=0;
            for(int j=0;j<grid.length;j++){
                int a=grid[j][i];
                int b=(int)(1+Math.floor(Math.log10(Math.abs(a))));
                if(a<0){
                    if(temp<b+1){
                        temp=b+1;
                    }
                }else{
                    if(temp<b){
                        temp=b;
                    }
                }
            }
            res[i]=temp;
        }
        System.out.println(Arrays.toString(res));
    }
}

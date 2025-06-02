package leetCode;

import java.util.Arrays;

/*
2373. Largest Local Values in a Matrix
Example 1:
Input: grid = [[9,9,8,1],[5,6,2,6],[8,2,6,4],[6,2,2,2]]
Output: [[9,9],[8,6]]
Explanation: The diagram above shows the original matrix and the generated matrix.
Notice that each value in the generated matrix corresponds to the largest value of a contiguous 3 x 3 matrix in grid.
Example 2:
Input: grid = [[1,1,1,1,1],[1,1,1,1,1],[1,1,2,1,1],[1,1,1,1,1],[1,1,1,1,1]]
Output: [[2,2,2],[2,2,2],[2,2,2]]
Explanation: Notice that the 2 is contained within every contiguous 3 x 3 matrix in grid.
 */
public class LC2373 {
    public static void main(String[] args) {
        int[][] grid={{9,9,8,1},{5,6,2,6},{8,2,6,4},{6,2,2,2}};
        int l=grid.length;
        int[][] arr=new int[l-2][l-2];

        System.out.println(Arrays.deepToString(arr));
    }
}

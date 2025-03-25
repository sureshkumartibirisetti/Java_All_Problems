package leetCode;

import java.util.Arrays;

/*
867. Transpose Matrix
Example 1:
Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [[1,4,7],[2,5,8],[3,6,9]]
Example 2:
Input: matrix = [[1,2,3],[4,5,6]]
Output: [[1,4],[2,5],[3,6]]
 */
public class LC867 {
    public static void main(String[] args) {
        int[][] matrix={{1,2,3},{4,5,6}};
        int[][] res=new int[matrix[0].length][matrix.length];
        for(int i=0;i< matrix.length;i++){
            for(int j=0;j< matrix[i].length;j++){
                res[j][i]=matrix[i][j];
            }

        }
        System.out.println(Arrays.deepToString(res));
    }
}

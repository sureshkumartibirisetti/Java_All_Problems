package leetCode;

import java.util.Arrays;

/*
3033. Modify the Matrix
Example 1:
Input: matrix = [[1,2,-1],[4,-1,6],[7,8,9]]
Output: [[1,2,9],[4,8,6],[7,8,9]]
Explanation: The diagram above shows the elements that are changed (in blue).
- We replace the value in the cell [1][1] with the maximum value in the column 1, that is 8.
- We replace the value in the cell [0][2] with the maximum value in the column 2, that is 9.
Example 2:
Input: matrix = [[3,-1],[5,2]]
Output: [[3,2],[5,2]]
Explanation: The diagram above shows the elements that are changed (in blue).
 */
public class LC3033 {
    public static void main(String[] args) {
        int[][] matrix={{3,-1},{5,2}};
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]==-1){
                    matrix[i][j]=ismatrix(matrix,j);
                }
            }
        }
        System.out.println(Arrays.deepToString(matrix));
    }
    static int ismatrix(int[][] matrix,int c){
        int res=0;
        for(int[] i:matrix){
            if(res<i[c]){
                res=i[c];
            }
        }
        return res;
    }
}

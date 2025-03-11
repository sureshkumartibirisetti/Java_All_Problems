package leetCode;
/*2643. Row With Maximum Ones
Example 1:
Input: mat = [[0,1],[1,0]]
Output: [0,1]
Explanation: Both rows have the same number of 1's. So we return the index of the smaller row, 0, and the maximum count of ones (1). So, the answer is [0,1].
Example 2:
Input: mat = [[0,0,0],[0,1,1]]
Output: [1,2]
Explanation: The row indexed 1 has the maximum count of ones (2). So we return its index, 1, and the count. So, the answer is [1,2].
Example 3:
Input: mat = [[0,0],[1,1],[0,0]]
Output: [1,2]
Explanation: The row indexed 1 has the maximum count of ones (2). So the answer is [1,2].
 */
public class LC2643 {
    public static void main(String[] args) {
        int[][] mat={{0,1},{1,0},{1,1}};
        int i_l=0;
        int v=0;
        for(int i=0;i<mat.length;i++){
            int res=0;
            for(int j=0;j<mat[i].length;j++){
                res+=mat[i][j];
            }
            if(v<res){
                v=res;
                i_l=i;
            }
        }
        System.out.println(new int[]{i_l,v});
    }
}

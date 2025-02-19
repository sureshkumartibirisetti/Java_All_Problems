package leetCode;
//Example 1:
//Input: grid = [[4,3,2,-1],[3,2,1,-1],[1,1,-1,-2],[-1,-1,-2,-3]]
//Output: 8
//Explanation: There are 8 negatives number in the matrix.
//Example 2:
//Input: grid = [[3,2],[1,0]]
//Output: 0
public class LC1351 {
    public static void main(String[] args) {
        int[][] grid={{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
        int res=0;
        for(int i=0;i<grid.length;i++){
            for(int j=grid[i].length-1;j>=0;j--){
                if(grid[i][j]<0){
                    res++;
                }else{
                    break;
                }
            }
        }
        System.out.println(res);
    }
}

package leetCode;
/*
2923. Find Champion I
Example 1:
Input: grid = [[0,1],[0,0]]
Output: 0
Explanation: There are two teams in this tournament.
grid[0][1] == 1 means that team 0 is stronger than team 1. So team 0 will be the champion.
Example 2:
Input: grid = [[0,0,1],[1,0,1],[0,0,0]]
Output: 1
Explanation: There are three teams in this tournament.
grid[1][0] == 1 means that team 1 is stronger than team 0.
grid[1][2] == 1 means that team 1 is stronger than team 2.
So team 1 will be the champion.
 */
public class LC2923 {
    public static void main(String[] args) {
        int[][] grid={{0,0,1},{1,0,1},{0,0,0}};
        int res=0;
        for(int i=0;i< grid.length;i++){
            int count=0;
            for(int j=0;j<grid[i].length;j++){
                if(i!=j){
                    if(grid[i][j]==1){
                        count++;
                    }
                }
            }
            if(count>res){
                res=i;
            }

        }
        System.out.println(res);

    }
}

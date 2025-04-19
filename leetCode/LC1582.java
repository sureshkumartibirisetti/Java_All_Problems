package leetCode;
/*
1582. Special Positions in a Binary Matrix
Example 1:
Input: mat = [[1,0,0],[0,0,1],[1,0,0]]
Output: 1
Explanation: (1, 2) is a special position because mat[1][2] == 1 and all other elements in row 1 and column 2 are 0.
Example 2:
Input: mat = [[1,0,0],[0,1,0],[0,0,1]]
Output: 3
Explanation: (0, 0), (1, 1) and (2, 2) are special positions
 */
public class LC1582 {
    public static void main(String[] args) {
        int[][] mat={{0,0},{0,0},{1,0}};
        int c_l=mat[0].length;
        int s_l=mat.length;
        int res=0;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                int cc=0;
                int rr=0;
                if(mat[i][j]==1){
                    for(int a=0;a<c_l;a++){
                        if(cc>1) {
                            cc=0;
                            break;
                        }
                        cc+=mat[i][a];
                    }
                    for(int b=0;b<s_l;b++){
                        if(rr>1){
                            rr=0;
                            break;
                        }
                        rr+=mat[b][j];
                    }
                }
                if(rr==1 && cc==1){
                    res++;
                }

            }
        }
        System.out.println(res);
    }
}

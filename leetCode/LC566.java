package leetCode;

import java.util.Arrays;

/*
566. Reshape the Matrix
Example 1:
Input: mat = [[1,2],[3,4]], r = 1, c = 4
Output: [[1,2,3,4]]
Example 2:
Input: mat = [[1,2],[3,4]], r = 2, c = 4
Output: [[1,2],[3,4]]
 */
public class LC566 {
    public static void main(String[] args) {
        int[][] mat={{1,2},{3,4}};
        int r=4;
        int c=1;
        int m=mat[0].length;
        int n=mat.length;
        if(m*n==r*c){
            int[][] res=new int[r][c];
            int a=0;
            int b=0;
            for(int[] i:mat){
                for(int j:i){
                    if(b==c){
                        a++;
                        b=0;
                    }
                    if(a<r){
                        res[a][b]=j;
                        b++;
                    }

                }
            }
            System.out.println(Arrays.deepToString(res));
        }
        System.out.println(mat);

    }
}

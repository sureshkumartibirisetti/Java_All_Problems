package Striver.SDE.Day_1_Arrays;

import java.util.Arrays;

//73. Set Matrix Zeroes
//Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's.
//You must do it in place.
//        Input: matrix = [[1,1,1],[1,0,1],[1,1,1]]
//Output: [[1,0,1],[0,0,0],[1,0,1]]
//Example 2:
//Input: matrix = [[0,1,2,0],[3,4,5,2],[1,3,1,5]]
//Output: [[0,0,0,0],[0,4,5,0],[0,3,1,0]]
public class Set_matrix_zeros {
    public static void main(String[] args) {
        int[][] arr={{1,0,1,1},{0,1,1,1}};
        for(int i=0;i< arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==0){
                    int r=i;
                    int c=j;
                    for(int a=0;a<arr.length;a++){
                        if(arr[a][c]>=1){
                            arr[a][c]=-1;
                        }
                    }
                    for(int b=0;b<arr[i].length;b++){
                        if(arr[r][b]>=1){
                            arr[r][b]=-1;
                        }
                    }
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==-1){
                    arr[i][j]=0;
                }
            }
        }
        System.out.println(Arrays.deepToString(arr));
    }
}

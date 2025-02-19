package leetCode;

import java.util.Arrays;

//1252. Cells with Odd Values in a Matrix
//Input: m = 2, n = 3, indices = [[0,1],[1,1]]
//Output: 6
//Explanation: Initial matrix = [[0,0,0],[0,0,0]].
//After applying first increment it becomes [[1,2,1],[0,1,0]].
//
//The final matrix is [[1,3,1],[1,3,1]], which contains 6 odd numbers.Input: m = 2, n = 2, indices = [[1,1],[0,0]]
//Output: 0
//Explanation: Final matrix = [[2,2],[2,2]]. There are no odd numbers in the final matrix.
public class LC1252 {
    public static void main(String[] args) {
        int m=2;
        int n=3;
        int index=0;
        int[][] arr={{0,1},{1,1}};
        int[][] res=new int[m][n];
       // System.out.println(Arrays.deepToString(nums));
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                index = 0;
                if (j > 0) {
                    while (index < res.length) {
                        res[index][arr[i][j]] += 1;
                        index++;
                    }
                } else {
                    while (index < res[0].length) {
                        res[arr[i][j]][index] += 1;
                        index++;
                    }
                }
            }
        }
        int count=0;
        for(int i=0;i<res.length;i++){
            for(int j=0;j<res[i].length;j++){
                if(res[i][j]%2!=0){
                    count++;
                }
            }
        }
        System.out.println(count);

    }
}

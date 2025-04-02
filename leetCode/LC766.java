package leetCode;
/*
766. Toeplitz Matrix
Example 1:
Input: matrix = [[1,2,3,4],[5,1,2,3],[9,5,1,2]]
Output: true
Explanation:
In the above grid, the diagonals are:
"[9]", "[5, 5]", "[1, 1, 1]", "[2, 2, 2]", "[3, 3]", "[4]".
In each diagonal all elements are the same, so the answer is True.
Example 2:
Input: matrix = [[1,2],[2,2]]
Output: false
Explanation:
The diagonal "[1, 2]" has different elements.
 */
public class LC766 {
    public static void main(String[] args) {
        int[][] matrix={{1,2},{2,2}};
        System.out.println(isToeplitz(matrix));

    }
    static boolean isToeplitz(int[][] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr[i].length-1;j++){
                if(arr[i][j]!=arr[i+1][j+1]){
                    return false;
                }
            }
        }
        return true;
    }
}

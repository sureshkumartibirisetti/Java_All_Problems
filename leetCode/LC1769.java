package leetCode;

import java.util.Arrays;

/*1769. Minimum Number of Operations to Move All Balls to Each Box
Example 1:
Input: boxes = "110"
Output: [1,1,3]
Explanation: The answer for each box is as follows:
        1) First box: you will have to move one ball from the second box to the first box in one operation.
        2) Second box: you will have to move one ball from the first box to the second box in one operation.
        3) Third box: you will have to move one ball from the first box to the third box in two operations, and move one ball from the second box to the third box in one operation.
Example 2:
Input: boxes = "001011"
Output: [11,8,5,4,3,4]
 */
public class LC1769 {
    public static void main(String[] args) {
        String boxes="001011";
        int[] arr=new int[boxes.length()];
        for(int i=0;i<boxes.length();i++){
            int res=0;
            for(int j=0;j<boxes.length();j++){
                if(boxes.charAt(j)=='1'){
                    res+=Math.abs(i-j);
                }
            }
            arr[i]=res;
        }
        System.out.println(Arrays.toString(arr));
    }
}

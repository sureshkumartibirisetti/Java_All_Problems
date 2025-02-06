package leetCode;

import java.util.Arrays;

//Input: heights = [1,1,4,2,1,3]
//Output: 3
//Explanation:
//heights:  [1,1,4,2,1,3]
//expected: [1,1,1,2,3,4]
//Indices 2, 4, and 5 do not match.
public class LC1051 {
    public static void main(String[] args) {
        int[] heights={1,1,4,2,1,3};
        int count=0;
        int[] temp=heights.clone();
        Arrays.sort(temp);
        for(int i=0;i< heights.length;i++){
            if(heights[i]!=temp[i]){
                count++;
            }
        }
//        System.out.println(Arrays.toString(heights));
//        System.out.println(Arrays.toString(temp));
        System.out.println(count);
    }
}

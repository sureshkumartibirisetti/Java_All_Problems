package Hyrtutorials.practice;

import java.util.Arrays;

public class twoDarr {
    public static void main(String[] args) {
        int[][] arr={
                {1,2,3},
                {5,6,7},
                {8,9,10}
        };
        System.out.println(Arrays.deepToString(arr));
        for(int[] i:arr){
            for(int j:i){
                System.out.println(j);
            }
        }
    }
}

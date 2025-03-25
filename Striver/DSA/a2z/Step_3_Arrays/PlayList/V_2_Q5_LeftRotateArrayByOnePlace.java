package Striver.DSA.a2z.Step_3_Arrays.PlayList;

import java.util.Arrays;

/*
input: arr={1,2,3,4,5}
output: {2,3,4,5,1}
 */
public class V_2_Q5_LeftRotateArrayByOnePlace {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int temp=arr[0];
        for(int i=1;i<arr.length;i++){
            arr[i-1]=arr[i];
        }
        arr[arr.length-1]=temp;
        System.out.println(Arrays.toString(arr));
    }
}

package Striver.Algorithms;

import java.util.Arrays;

/*
input={5,4,3,2,1}
 */
public class selectionSort {
    public static void main(String[] args) {
        int[] arr={65,34,46,2,23,643,44,234,22,33,22,98,97,75,37,78};
        for(int i=0;i<arr.length;i++){
            int tempIndex=0;
            int min=arr[i];
            for(int j=i+1;j<arr.length;j++){
                if(min>=arr[j]){
                    tempIndex=j;
                    min=arr[j];
                }
            }
            if(tempIndex!=0) {
                int temp = arr[i];
                arr[i] = arr[tempIndex];
                arr[tempIndex] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}

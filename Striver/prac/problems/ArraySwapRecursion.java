package Striver.prac.problems;

import java.util.Arrays;

public class ArraySwapRecursion {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int a=arr.length-1;
        swap(arr,0,a);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr, int i, int n){
        int temp;
        if(i>=n) return ;
        else
            temp=arr[i];
            arr[i]=arr[n];
            arr[n]=temp;
            swap(arr,i+1,n-1);
    }
//    static void printArray(int[] arr){
//        int a= arr.length;
//        for(int i:arr){
//            System.out.print(i+" ");
//        }

}


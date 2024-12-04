package Striver.prac.problems;

import java.util.Arrays;

import static Striver.prac.problems.ArraySwapRecursion.swap;

public class ArrSwapRecurOnePoint {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        func(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));
    }
    static void func(int[] arr,int i,int n){
        if(i>=n/2) return;
        swap(arr[i],arr[n-i-1]);
        func(arr,i+1,n);
    }
    static void swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;

    }
}

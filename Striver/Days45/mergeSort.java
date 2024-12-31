package Striver.Days45;

import java.util.*;

public class mergeSort {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int arrSize=in.nextInt();
        int[] arr=new int[arrSize];
        for(int i=0;i<arrSize;i++){
            arr[i]=in.nextInt();
        }
        int low=0;
        int high=arr.length-1;
        System.out.println("Before the sorting");
        System.out.println(Arrays.toString(arr));
        mergeS(arr,low,high);
        System.out.println("After the sorting");
        System.out.println(Arrays.toString(arr));
    }
    static void mergeS(int[] arr,int low,int high){
        if(low<high) {
            int mid = (low + high) / 2;
            mergeS(arr, low, mid);
            mergeS(arr, mid + 1, high);
            merge(arr, low, mid, high);
        }
    }
    static void merge(int[] arr,int low,int mid,int high){
        ArrayList<Integer> arrList=new ArrayList<>();
        int left=low;
        int right=mid+1;
        while(left<=mid && right<=high){
            if(arr[left]<=arr[right]){
                arrList.add(arr[left]);
                left++;
            }else{
                arrList.add(arr[right]);
                right++;
            }
        }
        while(left<=mid){
            arrList.add(arr[left]);
                    left++;
        }
        while(right<=high){
            arrList.add(arr[right]);
            right++;
        }
        for(int i=low;i<=high;i++){
            arr[i]=arrList.get(i-low);
        }
    }
}

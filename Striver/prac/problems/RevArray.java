package Striver.prac.problems;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class RevArray {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int[] arr=new int[a];
        for(int i=0;i<a;i++){
            arr[i]=in.nextInt();
        }
        int f=0;
        int l=arr.length-1;

        while(f<=l){
            int temp=arr[f];
            arr[f]=arr[l];
            arr[l]=temp;
            f++;
            l--;
        }
        System.out.println(Arrays.toString(arr));
    }
}

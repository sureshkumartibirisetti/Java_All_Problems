package Hyrtutorials.practice;

import java.util.Arrays;

public class arr_reverse {

    static void reverse(int l,int r,int[] a) {
        if(l>r) {
            return;
        }

        int t=a[l];
        a[l]=a[r];
        a[r]=t;
        reverse(l+1,r-1,a);

    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int a[]= {1,2,5,6,7,9,10};
        reverse(0,a.length-1,a);
        System.out.println(Arrays.toString(a));
    }

}
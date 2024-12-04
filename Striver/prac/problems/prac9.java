package Striver.prac.problems;

import java.util.Arrays;
//bubble Sort
public class prac9 {
    public static void main(String[] args) {
        int[] arr={25,14,16,1,3,90,45,6};
        int c=0;
        for(int j=1;j<arr.length;j++) {
            System.out.println(Arrays.toString(arr));
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] < arr[i - 1]) {
                    int temp = arr[i - 1];
                    arr[i - 1] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        //System.out.println(c);
    }
}

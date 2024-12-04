package Striver.prac.problems;

import java.util.Arrays;
//Contain Duplicates Better approach
public class prac8 {
    public static void main(String[] args) {
        int[] arr={9,1,4,6,1,3,8,9};
        Arrays.sort(arr);
        int c=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i-1]==arr[i]){
                c++;
            }
        }
        if (c==0) System.out.println("No");
        else System.out.println("yes");
//        double d=Math.pow(2,15);
//        System.out.println(d);
    }
}

package Neetcode;

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        System.out.println(Arrays.toString(plusOne(arr)));
    }
    public static int[] plusOne(int[] i) {
        long c=0;
        for(int j:i){
            c=c*10+j;
        }
        c=c+1;
        String s=Long.toString(c);
        String [] arr=s.split("");
        int[] ints = Arrays.stream(arr).mapToInt(Integer::parseInt).toArray();
        return ints;

    }
}

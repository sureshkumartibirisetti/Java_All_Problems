package leetCode;

import java.lang.reflect.Array;
import java.util.Arrays;

public class LC1486 {
    public static void main(String[] args) {
        int n=5;
        int start=0;
        int res=0;
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=start+2*i;
        }
        int result=0;
        for(int i=0;i<n;i++){
            result=result^arr[i];
        }
        System.out.println(result);
    }
}

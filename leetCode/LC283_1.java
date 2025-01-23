package leetCode;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class LC283_1 {
    public static void main(String[] args) {
        int[] nums={0,1,0,3,12};
        ArrayList<Integer> arr1=new ArrayList<>();//000
        ArrayList<Integer> arr2=new ArrayList<>();
        for(int i:nums){
            if(i==0){
                arr1.add(i);
            }else{
                arr2.add(i);
            }
        }
        arr2.addAll(arr1);
        System.out.println(Arrays.toString(arr2.toArray()).replaceAll(", ",","));
    }
}

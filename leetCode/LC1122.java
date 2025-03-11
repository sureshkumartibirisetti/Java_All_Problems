package leetCode;
//1122. Relative Sort Array
//Example 1:
//Input: arr1 = [2,3,1,3,2,4,6,7,9,2,19], arr2 = [2,1,4,3,9,6]
//Output: [2,2,2,1,4,3,3,9,6,7,19]
//Example 2:
//Input: arr1 = [28,6,22,8,44,17], arr2 = [22,28,8,6]
//Output: [22,28,8,6,17,44]

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class LC1122 {
    public static void main(String[] args) {
        int[] arr1={2,3,1,3,2,4,6,7,9,2,19};
        int[] arr2={2,1,4,3,9,6};
        List<Integer> al=new ArrayList<>();
        Arrays.sort(arr1);
        for(int i=0;i<arr2.length;i++){
            int c=0;
            for(int j=0;j<arr1.length;j++){
                if(arr2[i]==arr1[j]){
                    al.add(arr1[j]);
                    arr1[j]=-1;
                    c++;
                } else if (c>0) {
                    break;
                }
            }
        }
        for(int i:arr1){
            if(i!=-1){
                al.add(i);
            }
        }
        System.out.println(Arrays.toString(al.toArray()));
    }
}
//        HashMap<Integer,Integer> map=new HashMap<>();
//        for(int i:arr1){
//            map.put(i,map.getOrDefault(i,0)+1);
//        }
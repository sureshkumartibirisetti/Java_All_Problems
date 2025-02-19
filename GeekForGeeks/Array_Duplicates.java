package GeekForGeeks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

//Examples:
//Input: arr[] = [2, 3, 1, 2, 3]
//Output: [2, 3]
//Explanation: 2 and 3 occur more than once in the given array.
//Input: arr[] = [0, 3, 1, 2]
//Output: []
//Explanation: There is no repeating element in the array, so the output is empty.
//Input: arr[] = [2]
//Output: []
//Explanation: There is single element in the array. Therefore output is empty.
public class Array_Duplicates {
    public static void main(String[] args) {
        int[] arr={0,3,1,2,2,3,1,0};
        List<Integer> al=new ArrayList<>();
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i:arr){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        for(int i:hm.keySet()){
            int j=hm.get(i);
            if(j>1){
                al.add(i);
            }
        }
        System.out.println(al);
    }
}

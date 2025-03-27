package leetCode;

import java.util.HashMap;

/*
1394. Find Lucky Integer in an Array
Example 1:
Input: arr = [2,2,3,4]
Output: 2
Explanation: The only lucky number in the array is 2 because frequency[2] == 2.
Example 2:
Input: arr = [1,2,2,3,3,3]
Output: 3
Explanation: 1, 2 and 3 are all lucky numbers, return the largest of them.
Example 3:
Input: arr = [2,2,2,3,3]
Output: -1
Explanation: There are no lucky numbers in the array.
 */
public class LC1394 {
    public static void main(String[] args) {
        int[] arr={2,2,2,3,3};
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int res=-1;
        for(int i:map.keySet()){
            if(i==map.get(i)){
                if(res<i){
                    res=i;
                }
            }
        }
        System.out.println(res);


    }
}

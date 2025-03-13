package GeekForGeeks;

import java.util.HashMap;

/*Array Subset
Given two arrays a[] and b[], your task is to determine whether b[] is a subset of a[].
Examples:
Input: a[] = [11, 7, 1, 13, 21, 3, 7, 3], b[] = [11, 3, 7, 1, 7]
Output: true
Explanation: b[] is a subset of a[]
Input: a[] = [1, 2, 3, 4, 4, 5, 6], b[] = [1, 2, 4]
Output: true
Explanation: b[] is a subset of a[]
10 5 2 23 19
19 5 3
 */
public class Array_Subset {
    public static void main(String[] args) {
        int[] a={10,5,2,23,19};
        int[] b={19,5,3};
        HashMap<Integer,Integer> map=new HashMap<>();
        HashMap<Integer,Integer> map1=new HashMap<>();

        for(int i:a){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int i:b){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int i:map1.keySet()){
            if(map.containsKey(i)){
                if(map1.get(i)<=map.get(i)){
                    continue;
                }else{
                    break;
                }
            }else{
                break;
            }
        }


    }
}

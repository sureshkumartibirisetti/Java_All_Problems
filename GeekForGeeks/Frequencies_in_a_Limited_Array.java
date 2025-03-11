package GeekForGeeks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/*Frequencies in a Limited Array
Examples
Input: arr[] = [2, 3, 2, 3, 5]
Output: [0, 2, 2, 0, 1]
Explanation: We have: 1 occurring 0 times, 2 occurring 2 times, 3 occurring 2 times, 4 occurring 0 times, and 5 occurring 1 time.
        Input: arr[] = [3, 3, 3, 3]
Output: [0, 0, 4, 0]
Explanation: We have: 1 occurring 0 times, 2 occurring 0 times, 3 occurring 4 times, and 4 occurring 0 times.
        Input: arr[] = [1]
Output: [1]
Explanation: We have: 1 occurring 1 time, and there are no other numbers between 1 and the size of the array.
 */
public class Frequencies_in_a_Limited_Array {
    public static void main(String[] args) {
        int[] arr={1};
        List<Integer> al=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int i=1;i<=arr.length;i++){
            if(map.containsKey(i)){
                al.add(map.get(i));
            }else{
                al.add(0);
            }
        }
        System.out.println(al);
    }
}

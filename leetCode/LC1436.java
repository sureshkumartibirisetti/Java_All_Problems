package leetCode;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/*
1436. Destination City
Example 1:
Input: paths = [["London","New York"],["New York","Lima"],["Lima","Sao Paulo"]]
Output: "Sao Paulo"
Explanation: Starting at "London" city you will reach "Sao Paulo" city which is the destination city. Your trip consist of: "London" -> "New York" -> "Lima" -> "Sao Paulo".
Example 2:
Input: paths = [["B","C"],["D","B"],["C","A"]]
Output: "A"
Explanation: All possible trips are:
"D" -> "B" -> "C" -> "A".
"B" -> "C" -> "A".
"C" -> "A".
"A".
Clearly the destination city is "A".
Example 3:
Input: paths = [["A","Z"]]
Output: "Z"
 */
public class LC1436 {
    public static void main(String[] args) {
        List<List<String>> list= new ArrayList<>();
        list.add(Arrays.asList("london","new york"));
        list.add(Arrays.asList("new york","lima"));
        list.add(Arrays.asList("lima","sao paulo"));
        HashMap<String,Integer> map=new HashMap<>();
        int count=0;
        for(int i=0;i<list.size();i++){
            List<String> s=list.get(i);
            map.put(s.get(0),map.getOrDefault(s.get(0),0)+1);
        }
        for(List<String> i:list){
            if(!map.containsKey(i.get(1))){
                System.out.println(i.get(1));
            }
        }
        System.out.println("");
    }
}

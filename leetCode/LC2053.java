package leetCode;

import java.util.HashMap;
import java.util.LinkedHashMap;

//2053. Kth Distinct String in an ArrayInput: arr = ["d","b","c","b","c","a"], k = 2
//Output: "a"
//Explanation:
//The only distinct strings in arr are "d" and "a".
//"d" appears 1st, so it is the 1st distinct string.
//"a" appears 2nd, so it is the 2nd distinct string.
//Since k == 2, "a" is returned.
//Input: arr = ["aaa","aa","a"], k = 1
//Output: "aaa"
//Explanation:
//All strings in arr are distinct, so the 1st string "aaa" is returned.Input: arr = ["a","b","a"], k = 3
//Output: ""
//Explanation:
//The only distinct string is "b". Since there are fewer than 3 distinct strings, we return an empty string "".
public class LC2053 {
    public static void main(String[] args) {
        String[] arr={"d","b","c","b","c","a"};
        int k=2;
        System.out.println(kthDistinct(arr,k));

        }
    public static String kthDistinct(String[] arr, int k) {

        HashMap<String, Integer> map = new HashMap<>();

        for(String str : arr) {
            map.put(str, map.getOrDefault(str, 0)+1);
        }
        System.out.println(map);
        int count = 0;
        for(String str : arr) {
            if(map.get(str) == 1) count++;
            if(count == k) return str;
        }

        return "";
    }


}

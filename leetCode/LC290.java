package leetCode;

import java.util.HashMap;

//290. Word Pattern
//Example 1:
//Input: pattern = "abba", s = "dog cat cat dog"
//Output: true
//Explanation:
//The bijection can be established as:
//        'a' maps to "dog".
//        'b' maps to "cat".
//Example 2:
//Input: pattern = "abba", s = "dog cat cat fish"
//Output: false
//Example 3:
//Input: pattern = "aaaa", s = "dog cat cat dog"
//Output: false
public class LC290 {
    public static void main(String[] args) {
        String pattern="abba";
        String s="dog cat cat dog";
        String[] arr=s.split(" ");
        HashMap<Character,String> hm=new HashMap<>();
        if(arr.length!=pattern.length()){
            System.out.println(false);
        }
        for(int i=0;i<pattern.length();i++){
            char ch=pattern.charAt(i);
            if(hm.containsKey(ch)){
                if(hm.get(ch).equals(arr[i])){
                    continue;
                }else{
                    System.out.println(false);
                }
            }else{
                hm.put(ch,arr[i]);
            }
        }
        System.out.println(hm);
    }
}

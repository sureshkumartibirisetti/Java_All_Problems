package leetCode;
//Input: key = "the quick brown fox jumps over the lazy dog",
//message = "vkbs bs t suepuv"
//Output: "this is a secret"

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class LC2325 {
    public static void main(String[] args) {
        String res="";
        String message = "vkbs bs t suepuv";
        String key="the quick brown fox jumps over the lazy dog";
        String alpha="abcdefghijklmnopqrstuvwxyz";
        HashMap<Character,Character> hp=new HashMap<>();
        int j=97;
        for(int i=0;i<key.length();i++){
            if(hp.containsKey(key.charAt(i))){
                continue;
            }else if(key.charAt(i)==' '){
                continue;
            }
            else{
                hp.put(key.charAt(i),(char)(j));
                j++;
            }
        }
        for(int i=0;i<message.length();i++){
            if(message.charAt(i)==' '){
                res+=message.charAt(i);
            }else{
                res+=hp.get(message.charAt(i));
            }
        }
        System.out.println(res);
    }
}

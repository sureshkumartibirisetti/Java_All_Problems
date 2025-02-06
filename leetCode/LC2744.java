package leetCode;

import java.util.Arrays;
import java.util.HashMap;

//2744. Find Maximum Number of String Pairs
//Example 1:
//Input: words = ["cd","ac","dc","ca","zz"]
//Output: 2
//Explanation: In this example, we can form 2 pair of strings in the following way:
//We pair the 0th string with the 2nd string, as the reversed string of word[0] is "dc" and is equal to words[2].
//We pair the 1st string with the 3rd string, as the reversed string of word[1] is "ca" and is equal to words[3].
//It can be proven that 2 is the maximum number of pairs that can be formed.
//Example 3:
//Input: words = ["aa","ab"]
//Output: 0
//Explanation: In this example, we are unable to form any pair of strings.
public class LC2744 {
    public static void main(String[] args) {
        String[] words={"aa","ab"};
        int res=0;
        for(int i=0;i<words.length-1;i++){
            String s=words[i];
            for(int j=i+1;j< words.length;j++){
                String s1=words[j];
                if(s.charAt(0)==s1.charAt(1) && s.charAt(1)==s1.charAt(0)){
                    res++;
                    break;
                }
            }
        }
        System.out.println(res);

    }
}
//        HashMap<String,Integer> hm=new HashMap<>();
//        for(String s:words){
//        hm.put(s,hm.getOrDefault(s,0)+1);
//        }
//        System.out.println(hm);

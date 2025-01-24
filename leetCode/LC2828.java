package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Input: words = ["an","apple"], s = "a"
//Output: false
//Explanation: The first character in the words "an" and "apple" are 'a' and 'a', respectively.
//The acronym formed by concatenating these characters is "aa".
//Hence, s = "a" is not the acronym.
//List<String> words, String s
public class LC2828 {
    public static void main(String[] args) {
        List<String> words=new ArrayList<>(Arrays.asList("Apple", "Banana", "Cherry"));
        String s="ABC";
        String res="";
        for(int i=0;i<words.size();i++){
            res+=words.get(i).charAt(0);
        }
        if(s.equals(res)){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}

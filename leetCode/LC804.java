package leetCode;

import java.util.HashMap;
import java.util.HashSet;

//804. Unique Morse Code Words
//Example 1:
//
//Input: words = ["gin","zen","gig","msg"]
//Output: 2
//Explanation: The transformation of each word is:
//        "gin" -> "--...-."
//        "zen" -> "--...-."
//        "gig" -> "--...--."
//        "msg" -> "--...--."
//There are 2 different transformations: "--...-." and "--...--.".
//Example 2:
//
//Input: words = ["a"]
//Output: 1
public class LC804 {
    public static void main(String[] args) {
        String[] words={"a"};
        int res=0;
        HashMap<String, String> hm = new HashMap<>() {{
            put("a", ".-");
            put("b", "-...");
            put("c", "-.-.");
            put("d", "-..");
            put("e", ".");
            put("f", "..-.");
            put("g", "--.");
            put("h", "....");
            put("i", "..");
            put("j", ".---");
            put("k", "-.-");
            put("l", ".-..");
            put("m", "--");
            put("n", "-.");
            put("o", "---");
            put("p", ".--.");
            put("q", "--.-");
            put("r", ".-.");
            put("s", "...");
            put("t", "-");
            put("u", "..-");
            put("v", "...-");
            put("w", ".--");
            put("x", "-..-");
            put("y", "-.--");
            put("z", "--..");
        }};
        HashSet<String> hs=new HashSet<>();
        for(String i:words){
            String s="";
            for(int j=0;j<i.length();j++){
                s+=hm.get(i.charAt(j)+"");
            }
            hs.add(s);

        }
        System.out.println(hs.size());
    }
}

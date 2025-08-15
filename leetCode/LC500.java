package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
500. Keyboard Row
the first row consists of the characters "qwertyuiop",
the second row consists of the characters "asdfghjkl", and
the third row consists of the characters "zxcvbnm".
Example 1:
Input: words = ["Hello","Alaska","Dad","Peace"]
Output: ["Alaska","Dad"]
Explanation:
Both "a" and "A" are in the 2nd row of the American keyboard due to case insensitivity.
Example 2:
Input: words = ["omk"]
Output: []
Example 3:
Input: words = ["adsdf","sfd"]
Output: ["adsdf","sfd"]
 */
public class LC500 {
    public static void main(String[] args) {
        String[] words={"Hello","Alaska","Dad","Peace"};
        String r1="qwertyuiop";
        String r2="asdfghjkl";
        String r3="zxcvbnm";
        List<String> list=new ArrayList<>();
        for(String i:words){
            int c1=0;
            int c2=0;
            int c3=0;
            String s=i.toLowerCase();
            for(int j=0;j<i.length();j++){
                if(r1.contains(s.charAt(j)+"")){
                    c1++;
                }else if(r2.contains(s.charAt(j)+"")){
                    c2++;
                }else{
                    c3++;
                }
                if((c1>0 && c2>0)||(c2>0 && c3>0)||(c1>0 && c3>0)){
                    break;
                }
            }
            if(c1==i.length() || c2==i.length() || c3==i.length()){
                list.add(i);
            }
        }
        String[] array = list.toArray(new String[0]);
        System.out.println(Arrays.toString(array));
    }
}

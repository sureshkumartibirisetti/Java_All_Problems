package leetCode;

import java.util.Arrays;
import java.util.HashMap;

/*
2138. Divide a String Into Groups of Size k
Example 1:
Input: s = "abcdefghi", k = 3, fill = "x"
Output: ["abc","def","ghi"]
Explanation:
The first 3 characters "abc" form the first group.
The next 3 characters "def" form the second group.
The last 3 characters "ghi" form the third group.
Since all groups can be completely filled by characters from the string, we do not need to use fill.
Thus, the groups formed are "abc", "def", and "ghi".
Example 2:
Input: s = "abcdefghij", k = 3, fill = "x"
Output: ["abc","def","ghi","jxx"]
Explanation:
Similar to the previous example, we are forming the first three groups "abc", "def", and "ghi".
For the last group, we can only use the character 'j' from the string. To complete this group, we add 'x' twice.
Thus, the 4 groups formed are "abc", "def", "ghi", and "jxx".
 */
public class LC2138 {
    public static void main(String[] args) {
        String s="ctoyjrwtngqwt";
        int k=8;
        String fill="n";
        String[] res=new String[(s.length()+k-1)/k];
        int a=0;
        for(int i=0;i<s.length();i++){
            if((i+k-1)<s.length()){
               res[a]=s.substring(i,i+k);
               a++;
               i=i+k-1;

            }

            else{
                System.out.println(i);
                String b=s.substring(i,s.length());
                for(int j=b.length();j<k;j++){
                    b+=fill;
                }
                res[a]=b;
                i=i+k-1;
            }
        }
        System.out.println(Arrays.toString(res));

    }
}

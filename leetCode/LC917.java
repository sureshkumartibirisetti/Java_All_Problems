package leetCode;

import java.util.ArrayList;
import java.util.Arrays;

/*
917. Reverse Only Letters
Example 1:
Input: s = "ab-cd"
Output: "dc-ba"
Example 2:
Input: s = "a-bC-dEf-ghIj"
Output: "j-Ih-gfE-dCba"
Example 3:
Input: s = "Test1ng-Leet=code-Q!"
Output: "Qedo1ct-eeLg=ntse-T!"
 */
public class LC917 {
    public static void main(String[] args) {
        String s="Test1ng-Leet=code-Q!";
        String res="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if((ch>='a' && ch<='z')||(ch<='Z' && ch>='A')){
                res+=ch;
            }
        }
        int res_len=res.length()-1;
        String finalres="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if((ch>='a' && ch<='z')||(ch<='Z' && ch>='A')){
                finalres+=res.charAt(res_len);
                res_len--;
            }else{
                finalres+=ch;
            }
        }
        System.out.println(finalres);



    }
}

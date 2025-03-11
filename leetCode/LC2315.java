package leetCode;

import java.util.Arrays;

//2315. Count Asterisks
//Example 1:
//Input: s = "l|*e*et|c**o|*de|"
//Output: 2
//Explanation: The considered characters are underlined: "l|*e*et|c**o|*de|".
//The characters between the first and second '|' are excluded from the answer.
//        Also, the characters between the third and fourth '|' are excluded from the answer.
//There are 2 asterisks considered. Therefore, we return 2.
//Example 2:
//Input: s = "iamprogrammer"
//Output: 0
//Explanation: In this example, there are no asterisks in s. Therefore, we return 0.
//Example 3:
//Input: s = "yo|uar|e**|b|e***au|tifu|l"
//Output: 5
//Explanation: The considered characters are underlined: "yo|uar|e**|b|e***au|tifu|l". There are 5 asterisks considered. Therefore, we return 5.
public class LC2315 {
    public static void main(String[] args) {
        String s="yo|uar|e**|b|e***au|tifu|l";
        String[] arr=s.split("\\|");
        int res=0;
        System.out.println(Arrays.toString(arr));
        for(int i=0;i<arr.length;i+=2){
            String ss=arr[i];
            for(int j=0;j<ss.length();j++){
                if(ss.charAt(j)=='*'){
                    res++;
                }
            }
        }
        System.out.println(res);
    }
}

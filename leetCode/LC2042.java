package leetCode;

import java.util.Arrays;

/*2042. Check if Numbers Are Ascending in a Sentence
Example 1:
example-1
Input: s = "1 box has 3 blue 4 red 6 green and 12 yellow marbles"
Output: true
Explanation: The numbers in s are: 1, 3, 4, 6, 12.
They are strictly increasing from left to right: 1 < 3 < 4 < 6 < 12.
Example 2:
Input: s = "hello world 5 x 5"
Output: false
Explanation: The numbers in s are: 5, 5. They are not strictly increasing.
        Example 3:
example-3
Input: s = "sunset is at 7 51 pm overnight lows will be in the low 50 and 60 s"
Output: false
Explanation: The numbers in s are: 7, 51, 50, 60. They are not strictly increasing.
 */
public class LC2042 {
    public static void main(String[] args) {
        String s="1 box has 3 blue 4 red 6 green and 12 yellow marbles";
        String[] arr=s.split(" ");
        int j=-1;
        for(String i:arr){
            if(i.charAt(0)>='0' && i.charAt(0)<='9'){
                int a=Integer.parseInt(i);
                if(a<j){
                    j=a;
                }else{
                    System.out.println(false);
                }
            }
        }
        System.out.println(true);
    }
}

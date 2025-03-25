package leetCode;

import java.util.Arrays;

/*2578. Split With Minimum Sum
Example 1:
Input: num = 4325
Output: 59
Explanation: We can split 4325 so that num1 is 24 and num2 is 35, giving a sum of 59. We can prove that 59 is indeed the minimal possible sum.
Example 2:
Input: num = 687
Output: 75
Explanation: We can split 687 so that num1 is 68 and num2 is 7, which would give an optimal sum of 75.
 */
public class LC2578 {
    public static void main(String[] args) {
        int num=10;
        String s=Integer.toString(num);
        String[] arr=s.split("");
        Arrays.sort(arr);
        String s1="";
        String s2="";
        int l=0;
        int r=1;
        while(l<=arr.length && r<arr.length){
            s1+=arr[l];
            s2+=arr[r];
            l+=2;
            r+=2;
        }
        if(arr.length%2!=0){
            s1+=arr[arr.length-1];
        }
        int min=Integer.parseInt(s1)+Integer.parseInt(s2);
        System.out.println(min);
    }
}

package leetCode;

import java.util.Arrays;

/*
3536. Maximum Product of Two Digits
Example 1:
Input: n = 31
Output: 3
Explanation:
The digits of n are [3, 1].
The possible products of any two digits are: 3 * 1 = 3.
The maximum product is 3.
Example 2:
Input: n = 22
Output: 4
Explanation:
The digits of n are [2, 2].
The possible products of any two digits are: 2 * 2 = 4.
The maximum product is 4.
 */
public class LC3536 {
    public static void main(String[] args) {
        int n=123456789;
        int f1=0;
        int f2=0;
        while(n>0){
            int temp=n%10;
            if(temp>f1){
                f2=f1;
                f1=temp;
            }
            else if(temp<f1 && temp>f2){
                f2=temp;
            }
            n/=10;
        }
        System.out.println(f1*f2);

    }
}
//String s1=Integer.toString(n);
//String[] s=s1.split("");
//Arrays.sort(s);
//int len=s.length;
//System.out.println(Integer.parseInt(s[len-1])*Integer.parseInt(s[len-2]));

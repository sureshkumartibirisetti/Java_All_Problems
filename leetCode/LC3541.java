package leetCode;

import java.util.Arrays;

/*
3541. Find Most Frequent Vowel and Consonant
Example 1:
Input: s = "successes"
Output: 6
Explanation:
The vowels are: 'u' (frequency 1), 'e' (frequency 2). The maximum frequency is 2.
The consonants are: 's' (frequency 4), 'c' (frequency 2). The maximum frequency is 4.
The output is 2 + 4 = 6.
Example 2:
Input: s = "aeiaeia"
Output: 3
Explanation:
The vowels are: 'a' (frequency 3), 'e' ( frequency 2), 'i' (frequency 2). The maximum frequency is 3.
There are no consonants in s. Hence, maximum consonant frequency = 0.
The output is 3 + 0 = 3.
 */
public class LC3541 {
    public static void main(String[] args) {
        String s="successes";
        int[] arr=new int[26];
        for(int i=0;i<s.length();i++){
            int a=s.charAt(i)-'a';
            arr[a]++;
        }
        int v=0;
        int c=0;
        for(int i=0;i<26;i++){
            if(i==0||i==4||i==8||i==14||i==20){
                if(v<arr[i]){
                    v=arr[i];
                }
            }else{
                if(c<arr[i]){
                    c=arr[i];
                }
            }
        }
        System.out.println(v+c);
    }
}

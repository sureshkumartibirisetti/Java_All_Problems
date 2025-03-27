package leetCode;

import java.util.Arrays;

/*
2490. Circular Sentence
Example 1:
Input: sentence = "leetcode exercises sound delightful"
Output: true
Explanation: The words in sentence are ["leetcode", "exercises", "sound", "delightful"].
- leetcode's last character is equal to exercises's first character.
- exercises's last character is equal to sound's first character.
- sound's last character is equal to delightful's first character.
- delightful's last character is equal to leetcode's first character.
The sentence is circular.
Example 2:
Input: sentence = "eetcode"
Output: true
Explanation: The words in sentence are ["eetcode"].
- eetcode's last character is equal to eetcode's first character.
The sentence is circular.
Example 3:
Input: sentence = "Leetcode is cool"
Output: false
Explanation: The words in sentence are ["Leetcode", "is", "cool"].
- Leetcode's last character is not equal to is's first character.
The sentence is not circular.
 */
public class LC2490 {
    public static void main(String[] args) {
        String sentence="Leetcode is cool";
        String[] arr=sentence.split(" ");
        if(arr[0].charAt(0)!=arr[arr.length-1].charAt(arr[arr.length-1].length()-1)){
            System.out.println(false);
        }
        for(int i=1;i<arr.length;i++){
            if(arr[i].charAt(0)!=arr[i-1].charAt(arr[i-1].length()-1)){
                System.out.println(false);
            }
        }
        System.out.println(true);
    }
}

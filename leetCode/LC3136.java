package leetCode;
/*
3136. Valid Word
A word is considered valid if:
It contains a minimum of 3 characters.
It contains only digits (0-9), and English letters (uppercase and lowercase).
It includes at least one vowel.
It includes at least one consonant.
You are given a string word.
Return true if word is valid, otherwise, return false.
Notes:
'a', 'e', 'i', 'o', 'u', and their uppercases are vowels.
A consonant is an English letter that is not a vowel.
Example 1:
Input: word = "234Adas"
Output: true
Explanation:
This word satisfies the conditions.
Example 2:
Input: word = "b3"
Output: false
Explanation:
The length of this word is fewer than 3, and does not have a vowel.
Example 3:
Input: word = "a3$e"
Output: false
Explanation:
This word contains a '$' character and does not have a consonant.
Constraints:
1 <= word.length <= 20
word consists of English uppercase and lowercase letters, digits, '@', '#', and '$'
 */
public class LC3136 {
    public static void main(String[] args) {
        String word="b3As";
        int c=0;
        int con=0;
        int vow=0;
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            if(ch>='0' && ch<='9'){
                continue;
            }
            if("@#$".contains(ch+"")){
                System.out.println(false);
            }if("aeiouAEIOU".contains(ch+"")){
                vow++;
                c++;
            }else{
                con++;
                c++;
            }
        }
        if(con>=1 && vow>=1 && c>=3){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}

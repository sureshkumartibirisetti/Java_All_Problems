package leetCode;
/*
520. Detect Capital
Example 1:
Input: word = "USA"
Output: true
Example 2:
Input: word = "FlaG"
Output: false
 */
public class LC520 {
    public static void main(String[] args) {
        String word="Leetcode";
        if(word.equals(word.toUpperCase())){
            System.out.println(true);
        } else if(word.equals(word.toLowerCase())) {
            System.out.println(true);
        }
        String a=(word.charAt(0)+"").toUpperCase();
        String b=word.substring(1,word.length()).toLowerCase();

        String s=a+b;
        System.out.println(s);
        if(word.equals(s)){
            System.out.println(true);
        }
        System.out.println(false);
    }
}

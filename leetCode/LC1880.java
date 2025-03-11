package leetCode;
/*1880. Check if Word Equals Summation of Two Words
Example 1:
Input: firstWord = "acb", secondWord = "cba", targetWord = "cdb"
Output: true
Explanation:
The numerical value of firstWord is "acb" -> "021" -> 21.
The numerical value of secondWord is "cba" -> "210" -> 210.
The numerical value of targetWord is "cdb" -> "231" -> 231.
We return true because 21 + 210 == 231.
Example 2:
Input: firstWord = "aaa", secondWord = "a", targetWord = "aab"
Output: false
Explanation:
The numerical value of firstWord is "aaa" -> "000" -> 0.
The numerical value of secondWord is "a" -> "0" -> 0.
The numerical value of targetWord is "aab" -> "001" -> 1.
We return false because 0 + 0 != 1.
Example 3:
Input: firstWord = "aaa", secondWord = "a", targetWord = "aaaa"
Output: true
Explanation:
The numerical value of firstWord is "aaa" -> "000" -> 0.
The numerical value of secondWord is "a" -> "0" -> 0.
The numerical value of targetWord is "aaaa" -> "0000" -> 0.
We return true because 0 + 0 == 0.
 */
public class LC1880 {
    public static void main(String[] args) {
        String firstWord = "aaa", secondWord = "a", targetWord = "aab";
        int a=Integer.parseInt(num(firstWord));
        int b=Integer.parseInt(num(secondWord));
        int c=Integer.parseInt(num(targetWord));
        System.out.println(a+b==c);
    }
    static String num(String a){
        String res="";
        for(int i=0;i<a.length();i++){
            res+=a.charAt(i)-97;
        }
        return res;
    }
}

package leetCode;
/*
2129. Capitalize the Title
Example 1:
Input: title = "capiTalIze tHe titLe"
Output: "Capitalize The Title"
Explanation:
Since all the words have a length of at least 3, the first letter of each word is uppercase, and the remaining letters are lowercase.
Example 2:
Input: title = "First leTTeR of EACH Word"
Output: "First Letter of Each Word"
Explanation:
The word "of" has length 2, so it is all lowercase.
The remaining words have a length of at least 3, so the first letter of each remaining word is uppercase, and the remaining letters are lowercase.
Example 3:
Input: title = "i lOve leetcode"
Output: "i Love Leetcode"
Explanation:
The word "i" has length 1, so it is lowercase.
The remaining words have a length of at least 3, so the first letter of each remaining word is uppercase, and the remaining letters are lowercase.
 */
public class LC2129 {
    public static void main(String[] args) {
        String title = "capiTalIze tHe titLe";
        String[] s=title.split(" ");
        String res="";
        for(int i=0;i<s.length;i++){
           String temp=s[i].toLowerCase();
           if(temp.length()<=2){
               res+=temp;
           }else{
               res+=(char)(temp.charAt(0)-32)+temp.substring(1,temp.length());
           }
           res+=" ";

        }
        System.out.println(res.trim());
    }
}

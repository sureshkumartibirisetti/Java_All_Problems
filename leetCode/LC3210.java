package leetCode;
/*
3210. Find the Encrypted String
Example 1:
Input: s = "dart", k = 3
Output: "tdar"
Explanation:
For i = 0, the 3rd character after 'd' is 't'.
For i = 1, the 3rd character after 'a' is 'd'.
For i = 2, the 3rd character after 'r' is 'a'.
For i = 3, the 3rd character after 't' is 'r'.
Example 2:
Input: s = "aaa", k = 1
Output: "aaa"
Explanation:
As all the characters are the same, the encrypted string will also be the same.
 */
public class LC3210 {
    public static void main(String[] args) {
        String s="aaa";
        int k=1;
        String res="";
        for(int i=0;i<s.length();i++){
            if(i+k<s.length()){
                res+=s.charAt(i+k);
            }
            else{
                int temp=i+k;
                while(temp>=s.length()) {
                    temp=temp-s.length();
                }
                res+=s.charAt(temp);
            }
        }
        System.out.println(res);
    }
}

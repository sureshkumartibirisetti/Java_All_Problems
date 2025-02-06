package leetCode;
//1768. Merge Strings Alternately
//Input: word1 = "abc", word2 = "pqr"
//Output: "apbqcr"
//Explanation: The merged string will be merged as so:
//word1:  a   b   c
//word2:    p   q   r
//merged: a p b q c r
//Input: word1 = "ab", word2 = "pqrs"
//Output: "apbqrs"
//Explanation: Notice that as word2 is longer, "rs" is appended to the end.
//word1:  a   b
//word2:    p   q   r   s
//merged: a p b q   r   s
public class LC1768 {
    public static void main(String[] args) {
        String word1="abcd";
        String word2="pqr";
        String res="";
        int a=0;
        int b=0;
        int l=word1.length();
        int r=word2.length();
        while(a!=l || b!=r){
            if(a<l){
                res+=word1.charAt(a);
                a++;
            }if(b<r){
                res+=word2.charAt(b);
                b++;
            }
        }
        System.out.println(res);
    }
}

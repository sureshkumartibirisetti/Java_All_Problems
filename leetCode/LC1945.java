package leetCode;
/*1945. Sum of Digits of String After Convert
Example 1:
Input: s = "iiii", k = 1
Output: 36
Explanation:
The operations are as follows:
        - Convert: "iiii" ➝ "(9)(9)(9)(9)" ➝ "9999" ➝ 9999
        - Transform #1: 9999 ➝ 9 + 9 + 9 + 9 ➝ 36
Thus the resulting integer is 36.
Example 2:
Input: s = "leetcode", k = 2
Output: 6
Explanation:
The operations are as follows:
        - Convert: "leetcode" ➝ "(12)(5)(5)(20)(3)(15)(4)(5)" ➝ "12552031545" ➝ 12552031545
        - Transform #1: 12552031545 ➝ 1 + 2 + 5 + 5 + 2 + 0 + 3 + 1 + 5 + 4 + 5 ➝ 33
        - Transform #2: 33 ➝ 3 + 3 ➝ 6
Thus the resulting integer is 6.
Example 3:
Input: s = "zbax", k = 2
Output: 8

 */
public class LC1945 {
    public static void main(String[] args) {
        String s="leetcode";
        int k=2;
        k-=1;
        int s1=0;
        for(int i=0;i<s.length();i++){
            int s2=s.charAt(i)-96;
            s1+=s2;
        }
        while(k!=0){
            s1=sum(s1);
            k--;

        }
        System.out.println(s1);

    }
    public static int sum(int a){
        int res=0;
        while(a>0){
            int temp=a%10;
            res+=temp;
            a/=10;
        }
        return res;
    }
}
//for(int i=0;i<k;i++){
//        for(int j=0;j<s1.length();j++){
//
//        }
//        }

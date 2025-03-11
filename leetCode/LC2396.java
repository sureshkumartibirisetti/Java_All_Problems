package leetCode;
/*2396. Strictly Palindromic Number
An integer n is strictly palindromic if, for every base b between 2 and n - 2 (inclusive), the string representation of the integer n in base b is palindromic.
Given an integer n, return true if n is strictly palindromic and false otherwise.
A string is palindromic if it reads the same forward and backward.
Example 1:
Input: n = 9
Output: false
Explanation: In base 2: 9 = 1001 (base 2), which is palindromic.
In base 3: 9 = 100 (base 3), which is not palindromic.
Therefore, 9 is not strictly palindromic so we return false.
Note that in bases 4, 5, 6, and 7, n = 9 is also not palindromic.
Example 2:
Input: n = 4
Output: false
Explanation: We only consider base 2: 4 = 100 (base 2), which is not palindromic.
Therefore, we return false.
 */
public class LC2396 {
    public static void main(String[] args) {
        int n=4;
        for(int i=2;i<=n-2;i++){
            String s=baseConversion(Integer.toString(n),10,i);
            if(!isPalin(s)){
                System.out.println(false);
            }
        }
        System.out.println(true);

    }
    public static String baseConversion(String number, int sBase, int dBase)
    {
        return Integer.toString(
                Integer.parseInt(number, sBase), dBase);
    }
    public static boolean isPalin(String s){
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}

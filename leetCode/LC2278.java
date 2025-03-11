package leetCode;
/*2278. Percentage of Letter in String
Example 1:
Input: s = "foobar", letter = "o"
Output: 33
Explanation:
The percentage of characters in s that equal the letter 'o' is 2 / 6 * 100% = 33% when rounded down, so we return 33.
Example 2:
Input: s = "jjjj", letter = "k"
Output: 0
Explanation:
The percentage of characters in s that equal the letter 'k' is 0%, so we return 0.
 */
public class LC2278 {
    public static void main(String[] args) {
        String s="foobar";
        char letter='o';
        int l=s.length();
        int c=0;
        int p=0;
        for(int i=0;i<l;i++){
            if(s.charAt(i)==letter){
                c++;
            }
        }
        if(c==0){
            System.out.println(0);
        }

        int res=(c*100)/l;
        System.out.println(res);
    }
}

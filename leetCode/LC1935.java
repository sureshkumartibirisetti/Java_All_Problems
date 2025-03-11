package leetCode;
/*1935. Maximum Number of Words You Can Type
Example 1:
Input: text = "hello world", brokenLetters = "ad"
Output: 1
Explanation: We cannot type "world" because the 'd' key is broken.
        Example 2:
Input: text = "leet code", brokenLetters = "lt"
Output: 1
Explanation: We cannot type "leet" because the 'l' and 't' keys are broken.
        Example 3:
Input: text = "leet code", brokenLetters = "e"
Output: 0
Explanation: We cannot type either word because the 'e' key is broken.
 */
public class LC1935 {
    public static void main(String[] args) {
        String text="leet code";
        String brokenLetters = "lt";
        int res=0;
        String[] arr= text.split(" ");
        for(String i:arr){
            int s=0;
            for(int j=0;j<brokenLetters.length();j++){
                if(i.contains(brokenLetters.charAt(j)+"")){
                    s=1;
                    break;
                }
            }
            if(s==0){
                res++;
            }
        }
        System.out.println(res);
    }
}

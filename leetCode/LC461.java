package leetCode;
/*461. Hamming Distance
Example 1:
Input: x = 1, y = 4
Output: 2
Explanation:
        1   (0 0 0 1)
        4   (0 1 0 0)
               ↑   ↑
The above arrows point to positions where the corresponding bits are different.
Example 2:
Input: x = 3, y = 1
Output: 1
 */
public class LC461 {
    public static void main(String[] args) {
        int x=1;
        int y=4;
        String s1 = Integer.toBinaryString(x);
        String s2 = Integer.toBinaryString(y);
        if(s1.length()<s2.length()){
            while(s1.length()!=s2.length()){
                s1="0"+s1;
            }
        }else{
            while(s1.length()!=s2.length()){
                s2="0"+s2;
            }
        }
        int res=0;
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                res++;
            }
        }
        System.out.println(res);
    }

}

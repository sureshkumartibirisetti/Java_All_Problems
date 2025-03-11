package leetCode;
/*1780. Check if Number is a Sum of Powers of Three
Example 1:
Input: n = 12
Output: true
Explanation: 12 = 31 + 32
Example 2:
Input: n = 91
Output: true
Explanation: 91 = 30 + 32 + 34
Example 3:
Input: n = 21
Output: false
 */
public class LC1780 {
    public static void main(String[] args) {
        int n=7627;
        int temp=n;
        int res=0;
        int check=0;
        while(n>=0){
            int a=(int)(Math.cbrt(n));
            int b=(int)(Math.pow(a,3));
            if (n==1){
                System.out.println(true);
            }
            if(check!=a){
                check=a;
            }else{
                System.out.println(false);
            }
            res+=b;
            if(res==temp){
                System.out.println(true);
                break;
            }
            n=n-b;
        }
        System.out.println(false);

    }
}

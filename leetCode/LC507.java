package leetCode;
/*
507. Perfect Number
Example 1:
Input: num = 28
Output: true
Explanation: 28 = 1 + 2 + 4 + 7 + 14
1, 2, 4, 7, and 14 are all divisors of 28.
Example 2:
Input: num = 7
Output: false
 */
public class LC507 {
    public static void main(String[] args) {
        int num=28;
        int res=0;
        for(int i=1;i<=num/2;i++){
            if(num%i==0){
                res+=i;
            }
        }
        if(res==num){
            System.out.println(true);
        }
        System.out.println(false);
    }
}

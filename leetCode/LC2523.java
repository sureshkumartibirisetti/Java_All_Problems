package leetCode;
/*2523. Closest Prime Numbers in RangeExample 1:
Input: left = 10, right = 19
Output: [11,13]
Explanation: The prime numbers between 10 and 19 are 11, 13, 17, and 19.
The closest gap between any pair is 2, which can be achieved by [11,13] or [17,19].
Since 11 is smaller than 17, we return the first pair.
        Example 2:
Input: left = 4, right = 6
Output: [-1,-1]
Explanation: There exists only one prime number in the given range, so the conditions cannot be satisfied.
 */
public class LC2523 {
    public static void main(String[] args) {
        int left=10;
        int right=19;
        int min_dis=Integer.MAX_VALUE;
        int leftprime=-1;
        int rightprime=-1;
//        while(left<right){
//            if()
//        }
    }
    static boolean isprime(int i){
        for(int j=2;j<=Math.sqrt(i);j++){
            if(i%2==0){
                return false;
            }
        }
        return true;
    }
}

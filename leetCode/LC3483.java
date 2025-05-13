package leetCode;

import java.util.HashSet;

/*
3483. Unique 3-Digit Even Numbers
Example 1:
Input: digits = [1,2,3,4]
Output: 12
Explanation: The 12 distinct 3-digit even numbers that can be formed are 124, 132, 134, 142, 214, 234, 312, 314, 324, 342, 412, and 432. Note that 222 cannot be formed because there is only 1 copy of the digit 2.
Example 2:
Input: digits = [0,2,2]
Output: 2
Explanation: The only 3-digit even numbers that can be formed are 202 and 220. Note that the digit 2 can be used twice because it appears twice in the array.
Example 3:
Input: digits = [6,6,6]
Output: 1
Explanation: Only 666 can be formed.
Example 4:
Input: digits = [1,3,5]
Output: 0
Explanation: No even 3-digit numbers can be formed.
 */
public class LC3483 {
    public static void main(String[] args) {
        HashSet<Integer> set=new HashSet<>();
        int[] digits={1,3,5};
        int N=digits.length;
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                for(int k=0;k<N;k++){
                    if(i!=j && j!=k && i!=k){
                        int num=digits[i]*100+digits[j]*10+digits[k];
                        if(num%2==0 && 100<=num && num<=999){
                            set.add(num);
                        }
                    }
                }
            }

        }
        System.out.println(set.size());

    }
}

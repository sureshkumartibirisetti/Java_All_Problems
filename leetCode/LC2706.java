package leetCode;

import java.util.Arrays;

/*
2706. Buy Two Chocolates
Example 1:
Input: prices = [1,2,2], money = 3
Output: 0
Explanation: Purchase the chocolates priced at 1 and 2 units respectively. You will have 3 - 3 = 0 units of money afterwards. Thus, we return 0.
Example 2:
Input: prices = [3,2,3], money = 3
Output: 3
Explanation: You cannot buy 2 chocolates without going in debt, so we return 3.
 */
public class LC2706 {
    public static void main(String[] args) {
        int[] prices={1,2,2};
        int money=3;
        Arrays.sort(prices);
        int a=prices[0]+prices[1];
        if(money-a>=0){
            System.out.println(money-a);
        }else{
            System.out.println(money);
        }
    }
}

package leetCode;
/*Example 1:
Input: gifts = [25,64,9,4,100], k = 4
Output: 29
Explanation:
The gifts are taken in the following way:
        - In the first second, the last pile is chosen and 10 gifts are left behind.
        - Then the second pile is chosen and 8 gifts are left behind.
        - After that the first pile is chosen and 5 gifts are left behind.
        - Finally, the last pile is chosen again and 3 gifts are left behind.
The final remaining gifts are [5,8,9,4,3], so the total number of gifts remaining is 29.
Example 2:
Input: gifts = [1,1,1,1], k = 4
Output: 4
Explanation:
In this case, regardless which pile you choose, you have to leave behind 1 gift in each pile.
        That is, you can't take any pile with you.
So, the total gifts remaining are 4.
 */

import java.util.Collections;
import java.util.PriorityQueue;

public class LC2558 {
    public static void main(String[] args) {
        int[] g={25,64,9,4,100};
        int k=4;
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for (int val : g)
            maxHeap.add(val);

        for (int i = 0; i < k && maxHeap.peek() > 1; i++) {
            int x = maxHeap.poll();
            maxHeap.add((int) Math.sqrt(x));
        }

        long sum = 0;
        for (int val : maxHeap)
            sum += val;

        System.out.println(sum);
    }
}

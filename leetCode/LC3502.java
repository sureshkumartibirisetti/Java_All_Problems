package leetCode;

import java.util.Arrays;

/*
3502. Minimum Cost to Reach Every Position
Example 1:
Input: cost = [5,3,4,1,3,2]
Output: [5,3,3,1,1,1]
Explanation:
We can get to each position in the following way:
i = 0. We cn swap with person 0 for a cost of 5.
i = 1. We can swap with person 1 for a cost of 3.
i = 2. We can swap with person 1 for a cost of 3, then swap with person 2 for free.
i = 3. We can swap with person 3 for a cost of 1.
i = 4. We can swap with person 3 for a cost of 1, then swap with person 4 for free.
i = 5. We can swap with person 3 for a cost of 1, then swap with person 5 for free.
Example 2:
Input: cost = [1,2,4,6,7]
Output: [1,1,1,1,1]
Explanation:
We can swap with person 0 for a cost of 1, then we will be able to reach any position i for free.
 */
public class LC3502 {
    public static void main(String[] args) {
        int[] cost={5,3,4,1,3,2};
        int min=cost[0];
        for(int i=0;i<cost.length;i++){
            if(cost[i]<min){
                min=cost[i];
            }
            cost[i]=min;
        }
        System.out.println(Arrays.toString(cost));
    }
}

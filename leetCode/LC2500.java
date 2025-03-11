package leetCode;

import java.util.Arrays;

/* 2500. Delete Greatest Value in Each Row
Example 1:
Input: grid = [[1,2,4],[3,3,1]]
Output: 8
Explanation: The diagram above shows the removed values in each step.
        - In the first operation, we remove 4 from the first row and 3 from the second row (notice that, there are two cells with value 3 and we can remove any of them). We add 4 to the answer.
- In the second operation, we remove 2 from the first row and 3 from the second row. We add 3 to the answer.
- In the third operation, we remove 1 from the first row and 1 from the second row. We add 1 to the answer.
        The final answer = 4 + 3 + 1 = 8.
Example 2:
Input: grid = [[10]]
Output: 10
Explanation: The diagram above shows the removed values in each step.
        - In the first operation, we remove 10 from the first row. We add 10 to the answer.
        The final answer = 10.
 */
import java.util.Arrays;

import java.util.Arrays;

import java.util.Arrays;

public class LC2500 {
    public static void main(String[] args) {
        int[][] grid = {{5, 4, 3, 2, 1}, {1, 5, 4, 2, 3}};

        // Sort the 2D array lexicographically based on all elements in each row
        Arrays.sort(grid, (a, b) -> {
            for (int i = 0; i < a.length; i++) {
                if (a[i] != b[i]) {
                    return Integer.compare(a[i], b[i]); // Compare row elements element by element
                }
            }
            return 0; // If all elements are equal, return 0
        });

        // Print the sorted 2D array
        System.out.println(Arrays.deepToString(grid));
    }
}




package leetCode;

import java.util.Arrays;

/* 2037. Minimum Number of Moves to Seat Everyone
Example 1:
Input: seats = [3,1,5], students = [2,7,4]
Output: 4
Explanation: The students are moved as follows:
        - The first student is moved from position 2 to position 1 using 1 move.
- The second student is moved from position 7 to position 5 using 2 moves.
- The third student is moved from position 4 to position 3 using 1 move.
In total, 1 + 2 + 1 = 4 moves were used.
        Example 2:
Input: seats = [4,1,5,9], students = [1,3,2,6]
Output: 7
Explanation: The students are moved as follows:
        - The first student is not moved.
        - The second student is moved from position 3 to position 4 using 1 move.
- The third student is moved from position 2 to position 5 using 3 moves.
- The fourth student is moved from position 6 to position 9 using 3 moves.
In total, 0 + 1 + 3 + 3 = 7 moves were used.
        Example 3:
Input: seats = [2,2,6,6], students = [1,3,2,6]
Output: 4
Explanation: Note that there are two seats at position 2 and two seats at position 6.
The students are moved as follows:
        - The first student is moved from position 1 to position 2 using 1 move.
- The second student is moved from position 3 to position 6 using 3 moves.
- The third student is not moved.
        - The fourth student is not moved.
In total, 1 + 3 + 0 + 0 = 4 moves were used.
 */
public class LC2037 {
    public static void main(String[] args) {
        int[] seats={2,2,6,6};
        int[] students={1,3,2,6};
        Arrays.sort(seats);
        Arrays.sort(students);
        int res=0;
        for(int i=0;i<seats.length;i++){
            res+=Math.abs(seats[i]-students[i]);
        }
        System.out.println(res);
    }
}

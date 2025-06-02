package leetCode;
/*
3516. Find Closest Person
Example 1:
Input: x = 2, y = 7, z = 4
Output: 1
Explanation:
Person 1 is at position 2 and can reach Person 3 (at position 4) in 2 steps.
Person 2 is at position 7 and can reach Person 3 in 3 steps.
Since Person 1 reaches Person 3 first, the output is 1.
Example 2:
Input: x = 2, y = 5, z = 6
Output: 2
Explanation:
Person 1 is at position 2 and can reach Person 3 (at position 6) in 4 steps.
Person 2 is at position 5 and can reach Person 3 in 1 step.
Since Person 2 reaches Person 3 first, the output is 2.
Example 3:
Input: x = 1, y = 5, z = 3
Output: 0
Explanation:
Person 1 is at position 1 and can reach Person 3 (at position 3) in 2 steps.
Person 2 is at position 5 and can reach Person 3 in 2 steps.
Since both Person 1 and Person 2 reach Person 3 at the same time, the output is 0.
 */
public class LC3516 {
    public static void main(String[] args) {
        int x=2;
        int y=7;
        int z=4;
        int x1=Math.abs(x-z);
        int x2=Math.abs(y-z);
        System.out.println((x1==x2)?0:(x1>x2)?2:1);
    }
}

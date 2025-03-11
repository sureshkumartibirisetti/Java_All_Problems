package leetCode;
/*
2928. Distribute Candies Among Children I
Example 1:
Input: n = 5, limit = 2
Output: 3
Explanation: There are 3 ways to distribute 5 candies such that no child gets more than 2 candies: (1, 2, 2), (2, 1, 2) and (2, 2, 1).
Example 2:
Input: n = 3, limit = 3
Output: 10
Explanation: There are 10 ways to distribute 3 candies such that no child gets more than 3 candies: (0, 0, 3), (0, 1, 2), (0, 2, 1), (0, 3, 0), (1, 0, 2), (1, 1, 1), (1, 2, 0), (2, 0, 1), (2, 1, 0) and (3, 0, 0).
 */
public class LC2928 {
    public static void main(String[] args) {
        int n=3,limit=3;
        int c=0;
        for(int i=0;i<=limit;i++){
            for(int j=0;j<=limit;j++){
                for(int k=0;k<=limit;k++){
                    if((i+j+k)==n){
                        c++;
                    }
                }
            }
        }
        System.out.println(c);
    }
}

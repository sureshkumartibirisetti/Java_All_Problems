package leetCode;

import java.util.HashMap;

/*
1742. Maximum Number of Balls in a Box
Example 1:
Input: lowLimit = 1, highLimit = 10
Output: 2
Explanation:
Box Number:  1 2 3 4 5 6 7 8 9 10 11 ...
Ball Count:  2 1 1 1 1 1 1 1 1 0  0  ...
Box 1 has the most number of balls with 2 balls.
Example 2:
Input: lowLimit = 5, highLimit = 15
Output: 2
Explanation:
Box Number:  1 2 3 4 5 6 7 8 9 10 11 ...
Ball Count:  1 1 1 1 2 2 1 1 1 0  0  ...
Boxes 5 and 6 have the most number of balls with 2 balls in each.
Example 3:
Input: lowLimit = 19, highLimit = 28
Output: 2
Explanation:
Box Number:  1 2 3 4 5 6 7 8 9 10 11 12 ...
Ball Count:  0 1 1 1 1 1 1 1 1 2  0  0  ...
Box 10 has the most number of balls with 2 balls.
 */
public class LC1742 {
    public static void main(String[] args) {
        int lowLimit=5;
        int highLimit=15;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=lowLimit;i<=highLimit;i++){
            int a=isSum(i);
            map.put(a,map.getOrDefault(a,0)+1);
        }
        int result=0;
        for(int i:map.values()){
            if(i>result){
                result=i;
            }
        }
        System.out.println(result);
    }
    static int isSum(int i){
        int res=0;
        while(i>0){
            int temp=i%10;
            res+=temp;
            i/=10;
        }
        return res;
    }
}

package leetCode;

import java.util.HashMap;

/*
1399. Count Largest Group
Example 1:
Input: n = 13
Output: 4
Explanation: There are 9 groups in total, they are grouped according sum of its digits of numbers from 1 to 13:
[1,10], [2,11], [3,12], [4,13], [5], [6], [7], [8], [9].
There are 4 groups with largest size.
Example 2:
Input: n = 2
Output: 2
Explanation: There are 2 groups [1], [2] of size 1.
 */
public class LC1399 {
    public static void main(String[] args) {
        int n=13;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=1;i<=n;i++){
            int a=digitSum(i);

                map.put(a,map.getOrDefault(a,0)+1);

        }
        System.out.println(map);

    }
    static int digitSum(int n){
        int res=0;
        while(n>0){
            int temp=n%10;
            res+=temp;
            n/=10;
        }
        return res;
    }
}

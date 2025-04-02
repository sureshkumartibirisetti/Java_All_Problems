package HackerRank;

import java.util.HashMap;

/*
Sales by Match
Sample Input

STDIN                       Function
-----                       --------
9                           n = 9
10 20 20 10 10 30 50 10 20  ar = [10, 20, 20, 10, 10, 30, 50, 10, 20]
Sample Output

3
 */
public class Sales_by_Match {
    public static void main(String[] args) {
        int n=9;
        int[] arr={10, 20, 20, 10, 10, 30, 50, 10, 20};
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i: arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int c=0;
        for(int i:map.values()){
            c+=(i/2);
        }
        System.out.println(c);
    }
}

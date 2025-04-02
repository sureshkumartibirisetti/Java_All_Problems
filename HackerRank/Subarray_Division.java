package HackerRank;

import java.util.ArrayList;
import java.util.List;

/*
Sample Input 0
5
1 2 1 3 2
3 2
Sample Output 0
2
Sample Input 1
6
1 1 1 1 1 1
3 2
Sample Output 1
0
Sample Input 2
1
4
4 1
Sample Output 2
1
 */
public class Subarray_Division {
    public static void main(String[] args) {
        int n=5;
        int[] arr={1, 2, 1, 3, 2};
        int d=3;
        int m=2;
        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(1);
        list.add(3);
        list.add(2);

        int c=0;
        for(int i=0;i<=n-m;i++){
            int s=0;
            for(int j=i;j<i+m;j++){
                s+=list.get(j);
            }
            if(s==d){
                c++;
            }
        }
        System.out.println(c);
    }
}


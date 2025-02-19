package leetCode;

import java.util.Arrays;
import java.util.HashMap;

//2965. Find Missing and Repeated Values
//Example 1:
//Input: grid = [[1,3],[2,2]]
//Output: [2,4]
//Explanation: Number 2 is repeated and number 4 is missing so the answer is [2,4].
//Example 2:
//Input: grid = [[9,1,7],[8,9,2],[3,4,6]]
//Output: [9,5]
//Explanation: Number 9 is repeated and number 5 is missing so the answer is [9,5].
public class LC2965 {
    public static void main(String[] args) {
        int[][] grid={{9,1,7},{8,9,2},{3,4,6}};
        int l=grid.length* grid.length;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i< grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                hm.put(grid[i][j],hm.getOrDefault(grid[i][j],0)+1);
            }
        }
        int res=0;
        int m=0;
        for(int i: hm.keySet()){
            res+=i;
            if(hm.get(i)>1){
                m=i;
            }
        }
        int r=((l*(l+1))/2)-res;
        System.out.println(Arrays.toString(new int[]{m,r}));

    }
}

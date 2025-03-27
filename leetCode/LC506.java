package leetCode;

import java.util.Arrays;
import java.util.HashMap;

/*
506. Relative Ranks
Example 1:
Input: score = [5,4,3,2,1]
Output: ["Gold Medal","Silver Medal","Bronze Medal","4","5"]
Explanation: The placements are [1st, 2nd, 3rd, 4th, 5th].
Example 2:
Input: score = [10,3,8,9,4]
Output: ["Gold Medal","5","Bronze Medal","Silver Medal","4"]
Explanation: The placements are [1st, 5th, 3rd, 2nd, 4th].
 */
public class LC506 {
    public static void main(String[] args) {

        int[] score={10,3,8,9,4};
        int[] temp=Arrays.copyOf(score,score.length);
        String[] result=new String[score.length];
        Arrays.sort(score);
        HashMap<Integer,String> map=new HashMap<>();
        int a=score.length;
        for(int i=0;i<score.length;i++){
            if(i== score.length-1){
                map.put(score[i],"Gold Medal");
            } else if (i== score.length-2) {
                map.put(score[i],"Silver Medal");
            }else if(i==score.length-3){
                map.put(score[i],"Bronze Medal");
            }else{
                map.put(score[i],Integer.toString(a));
                a-=1;
            }
        }
        for(int i=0;i<score.length;i++){
            result[i]=map.get(temp[i]);
        }
        System.out.println(Arrays.toString(result));
    }
}

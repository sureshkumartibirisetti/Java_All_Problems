package leetCode;
/*2379. Minimum Recolors to Get K Consecutive Black Blocks
Example 1:
Input: blocks = "WBBWWBBWBW", k = 7
Output: 3
Explanation:
One way to achieve 7 consecutive black blocks is to recolor the 0th, 3rd, and 4th blocks
so that blocks = "BBBBBBBWBW".
It can be shown that there is no way to achieve 7 consecutive black blocks in less than 3 operations.
        Therefore, we return 3.
Example 2:
Input: blocks = "WBWBBBW", k = 2
Output: 0
Explanation:
No changes need to be made, since 2 consecutive black blocks already exist.
        Therefore, we return 0.
 */
public class LC2379 {
    public static void main(String[] args) {
        String blocks="WBWBBBW";
        int k=2;
        int res=Integer.MAX_VALUE;
        int l=blocks.length();
        for(int i=0;i<blocks.length();i++){
            if(l-i>=k){
                int min=0;
                for(int j=i;j<i+k;j++){
                   if(blocks.charAt(j)=='W'){
                       min++;
                   }
               }
               if(res>min){
                   res=min;
               }
            }else{
                break;
            }
        }
        System.out.println(res);
    }
}

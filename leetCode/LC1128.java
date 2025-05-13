package leetCode;
/*
1128. Number of Equivalent Domino Pairs
Example 1:
Input: dominoes = [[1,2],[2,1],[3,4],[5,6]]
Output: 1
Example 2:
Input: dominoes = [[1,2],[1,2],[1,1],[1,2],[2,2]]
Output: 3
 */
public class LC1128 {
    public static void main(String[] args) {
        int[][] dominoes={{1,2},{2,1},{3,4},{5,6}};
        int count=0;
        for(int i=0;i<dominoes.length-1;i++){
            for(int j=i+1;j<dominoes.length;j++){
                if((dominoes[i][0]==dominoes[j][1] && dominoes[i][1]==dominoes[j][0])||(dominoes[i][0]==dominoes[j][0] && dominoes[i][1]==dominoes[j][1])){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}

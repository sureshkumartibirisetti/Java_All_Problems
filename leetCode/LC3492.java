package leetCode;
/*
3492. Maximum Containers on a Ship
Example 1:
Input: n = 2, w = 3, maxWeight = 15
Output: 4
Explanation:
The deck has 4 cells, and each container weighs 3. The total weight of loading all containers is 12, which does not exceed maxWeight.
Example 2:
Input: n = 3, w = 5, maxWeight = 20
Output: 4
Explanation:
The deck has 9 cells, and each container weighs 5. The maximum number of containers that can be loaded without exceeding maxWeight is 4.
 */
public class LC3492 {
    public static void main(String[] args) {
        int n=2;
        int w=3;
        int maxWeight=15;
        int a=n*n;
        int res=0;
        int res1=0;
        for(int i=1;i<=a;i++){
           res+=w;
           if(res>maxWeight){
               break;
           }else{
               res1+=1;
           }
        }
        System.out.println(res1);
    }
}

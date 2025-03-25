package leetCode;

import java.util.Arrays;

/*1710. Maximum Units on a Truck
Example 1:
Input: boxTypes = [[1,3],[2,2],[3,1]], truckSize = 4
Output: 8
Explanation: There are:
        - 1 box of the first type that contains 3 units.
- 2 boxes of the second type that contain 2 units each.
        - 3 boxes of the third type that contain 1 unit each.
You can take all the boxes of the first and second types, and one box of the third type.
The total number of units will be = (1 * 3) + (2 * 2) + (1 * 1) = 8.
Example 2:
Input: boxTypes = [[5,10],[2,5],[4,7],[3,9]], truckSize = 10
Output: 91
 */
public class LC1710 {
    public static void main(String[] args) {
        int[][] boxTypes={{5,10},{2,5},{4,7},{3,9}};
        int truckSize=10;
        Arrays.sort(boxTypes, (a, b) -> Integer.compare(b[1], a[1]));
        System.out.println(Arrays.deepToString(boxTypes));
        //[[5, 10], [3, 9], [4, 7], [2, 5]]
        int res=0;
        int count=0;
        for(int[] i:boxTypes){
           count+=i[0];
           if(count<=truckSize){
               res+=(i[0]*i[1]);
           }else{
               int a=count-truckSize;
               int b=i[0]-a;
               res+=(b*i[1]);
               break;
           }

        }
        System.out.println(res);


    }
}
/*
int res=0;
        int f_res=0;
        for(int[] i:boxTypes){
            int a=truckSize-res;
            if(a<i[0]){
                res+=i[0];
                f_res+=(i[0]*i[1]);
            }else if(res==truckSize){
                break;
            }else{
                //int a=truckSize-res;
                f_res+=res*(a*i[1]);
                res+=a;
            }
        }
        System.out.println(f_res);
 */

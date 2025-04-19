package leetCode;
/*
1385. Find the Distance Value Between Two Arrays
Example 1:
Input: arr1 = [4,5,8], arr2 = [10,9,1,8], d = 2
Output: 2
Explanation:
For arr1[0]=4 we have:
|4-10|=6 > d=2
|4-9|=5 > d=2
|4-1|=3 > d=2
|4-8|=4 > d=2
For arr1[1]=5 we have:
|5-10|=5 > d=2
|5-9|=4 > d=2
|5-1|=4 > d=2
|5-8|=3 > d=2
For arr1[2]=8 we have:
|8-10|=2 <= d=2
|8-9|=1 <= d=2
|8-1|=7 > d=2
|8-8|=0 <= d=2
Example 2:
Input: arr1 = [1,4,2,3], arr2 = [-4,-3,6,10,20,30], d = 3
Output: 2
Example 3:
Input: arr1 = [2,1,100,3], arr2 = [-5,-2,10,-3,7], d = 6
Output: 1
 */
public class LC1385 {
    public static void main(String[] args) {
        int[] arr1={2,1,100,3};
        int[] arr2={-5,-2,10,-3,7};
        int d=6;
        int count=0;
        for(int i=0;i< arr1.length;i++){
            int c=0;
            for(int j=0;j< arr2.length;j++){
                if(Math.abs(arr1[i]-arr2[j])<=d){
                    break;
                }else{
                    c++;
                }
            }
            if(c==arr2.length){
                count++;
            }
        }
        System.out.println(count);
    }
}

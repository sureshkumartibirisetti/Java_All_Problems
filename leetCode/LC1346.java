package leetCode;
/*1346. Check If N and Its Double Exist
Example 1:
Input: arr = [10,2,5,3]
Output: true
Explanation: For i = 0 and j = 2, arr[i] == 10 == 2 * 5 == 2 * arr[j]
Example 2:
Input: arr = [3,1,7,11]
Output: false
Explanation: There is no i and j that satisfy the conditions.
 */
public class LC1346 {
    public static void main(String[] args) {
        int[] arr={-2,0,10,-19,4,6,-8};
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]*2){
                    System.out.println(true);
                }
            }
        }
        System.out.println(false);
    }
}

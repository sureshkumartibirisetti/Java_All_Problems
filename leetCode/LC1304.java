package leetCode;

import java.util.Arrays;

//1304. Find N Unique Integers Sum up to Zero
//Example 1:
//Input: n = 5
//Output: [-7,-1,1,3,4]
//Explanation: These arrays also are accepted [-5,-1,1,2,3] , [-3,-1,2,-2,4].
//Example 2:
//Input: n = 3
//Output: [-1,0,1]
//Example 3:
//Input: n = 1
//Output: [0]
public class LC1304 {
    public static void main(String[] args) {
        int n=10;
        int[] arr=new int[n];
        if(n%2==0){
            int j=0;
            for(int i=(n/2)*-1;i<=n/2;i++){
                if(i==0){
                    continue;
                }else{
                    arr[j]=i;
                    j++;
                }
            }
        }else{
            int j=0;
            for(int i=(n/2)*-1;i<=n/2;i++){

                    arr[j]=i;
                    j++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}

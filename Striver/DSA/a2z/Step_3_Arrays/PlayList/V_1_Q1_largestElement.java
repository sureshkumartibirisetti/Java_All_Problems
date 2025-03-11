package Striver.DSA.a2z.Step_3_Arrays.PlayList;

import java.util.Arrays;

public class V_1_Q1_largestElement {
    public static void main(String[] args) {
        int[] arr={1,6,3,7,2,1,8,9};
        int lar=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>lar){
                lar=arr[i];
            }
        }
        System.out.println(lar);

    }
}
/* Brute Force(time complexity:O(n log n))
int[] arr={1,6,3,7,2,1,8,9};
Arrays.sort(arr);
System.out.println(arr[arr.length-1]);
 */

/* Optimized (time complexity:O(n))
int[] arr={1,6,3,7,2,1,8,9};
int lar=arr[0];
for(int i=1;i<arr.length;i++){
    if(arr[i]>lar){
        lar=arr[i];
    }
}
System.out.println(lar);
 */

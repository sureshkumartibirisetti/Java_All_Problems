package GeekForGeeks;

import java.util.Arrays;

/*
Selection Sort
Examples :

Input: arr[] = [4, 1, 3, 9, 7]
Output: [1, 3, 4, 7, 9]
Explanation: Maintain sorted (in bold) and unsorted subarrays. Select 1. Array becomes 1 4 3 9 7. Select 3. Array becomes 1 3 4 9 7. Select 4. Array becomes 1 3 4 9 7. Select 7. Array becomes 1 3 4 7 9. Select 9. Array becomes 1 3 4 7 9.
Input: arr[] = [10, 9, 8, 7, 6, 5, 4, 3, 2, 1]
Output: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
Input: arr[] = [38, 31, 20, 14, 30]
Output: [14, 20, 30, 31, 38]
 */
public class Selection_Sort {
    public static void main(String[] args) {
        int[] arr={10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        for(int i=0;i<arr.length-1;i++){
            int temp=0;
            int a=arr[i];
            for(int j=i+1;j<arr.length;j++){
                if(a>arr[j]){
                    a=arr[j];
                    temp=j;
                }
            }
            if(temp!=0) {
                int temp1 = arr[temp];
                arr[temp] = arr[i];
                arr[i] = temp1;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}

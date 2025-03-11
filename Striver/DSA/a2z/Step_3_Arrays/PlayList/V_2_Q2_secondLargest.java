package Striver.DSA.a2z.Step_3_Arrays.PlayList;

import java.util.Arrays;

public class V_2_Q2_secondLargest {
    public static void main(String[] args) {
        int[] arr={1,5,2,4,8,1,9,33,77,33,22,777,22,111};
        Arrays.sort(arr);
        int lar=arr[arr.length-1];
        int n=arr.length-1;
        int s_lar=0;
        for(int i=n-1;i>=0;i--){
            if(arr[i]!=lar){
                s_lar=arr[i];
                break;
            }
        }
        System.out.println(s_lar);
    }
}

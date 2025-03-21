package Striver.DSA.a2z.Step_3_Arrays.PlayList;

import java.util.Arrays;

public class V_1_Q2_secondLargest {
    public static void main(String[] args) {
        int[] arr={1,5,2,4,8,1,9,33,77,33,22,777,22,1111};
        int f_l=arr[0];
        int s_l=-1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>f_l){
                int temp=f_l;
                f_l=arr[i];
                s_l=temp;
            }else{
                if(s_l<arr[i] && f_l>arr[i]){
                    s_l=arr[i];
                }
            }
        }
        System.out.println(f_l);
        System.out.println(s_l);
    }
}
/*
Brute Force:-
-----------------------------------------------------
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

Optimal solution:-
------------------------------------------------------
int[] arr={1,5,2,4,8,1,9,33,77,33,22,777,22,1111};
        int f_l=arr[0];
        int s_l=-1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>f_l){
                int temp=f_l;
                f_l=arr[i];
                s_l=temp;
            }else{
                if(s_l<arr[i] && f_l>arr[i]){
                    s_l=arr[i];
                }
            }
        }
        System.out.println(f_l);
        System.out.println(s_l);
 */

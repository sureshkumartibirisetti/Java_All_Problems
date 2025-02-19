package Rough;

import java.util.Scanner;

/*
3
6
9
10 3 2 4 5 6 9 7 3
 */
public class r10 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a=3;
        int b=6;
        int res=Integer.MAX_VALUE;
        int[] arr={10,3,2,4,5,6,9,7,3};
        for(int i=0;i<arr.length;i++){
            if(arr[i]==a){
              for(int j=i+1;j<arr.length;j++){
                  if(arr[j]==b){
                      int x=j-i;
                      if(res>x){
                          res=x;
                      }
                  }
              }
            }
            if(arr[i]==b){
                for(int j=i+1;j<arr.length;j++){
                    if(arr[j]==a){
                        int x=j-i;
                        if(res>x){
                            res=x;
                        }
                    }
                }
            }
        }
        System.out.println(res-1);
    }
}

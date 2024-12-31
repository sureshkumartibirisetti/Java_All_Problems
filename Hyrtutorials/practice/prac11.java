package Hyrtutorials.practice;

import java.util.Scanner;

public class prac11 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
            int n=in.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=in.nextInt();
            }
            int s=1;
            int res=0;
            for(int j:arr){
                if(s%2==j%2){

                }else{
                    res+=j;
                }
                s++;
            }
            System.out.println(res);
        }
    }
}

package Hyrtutorials.practice;

import java.util.Arrays;

public class countPrimes {
    public static void main(String[] args) {
        int n=10;
        int count=0;
        boolean[] arr=new boolean[n+1];
        Arrays.fill(arr,true);
        for(int i=2;i*i<=n;i++){
            if(arr[i]){
                for(int j=i*i;j<=n;j+=i){
                    arr[j]=false;
                }
            }
        }
        for(int i=2;i<arr.length;i++){
            if(arr[i]){
                count++;
            }
        }
        System.out.println(count);
    }
}

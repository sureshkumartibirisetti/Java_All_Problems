package Striver.DSA.a2z;

import java.util.Arrays;
import java.util.Scanner;

public class prime {
    static boolean[] isprime(int N){
        boolean[] arr=new boolean[N+1];
        Arrays.fill(arr,true);
        arr[0]=arr[1]=false;
        for(int i=2;i<=N;i++){
            if(arr[i]){
                for(int j=i*i;j<=N;j+=i){
                    arr[j]=false;
                }
            }
        }
        return arr;

    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        boolean[] arr=isprime(a);
        for(int i=2;i<=a;i++){
            if(arr[i]){
                System.out.print(i+" ");
            }
        }


    }
}

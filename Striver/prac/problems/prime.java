package Striver.prac.problems;

import java.util.Arrays;
import java.util.Scanner;
//sieve of erasthothenes
public class prime {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        boolean[] arr=new boolean[n+1];
        Arrays.fill(arr,true);
        for(int i=2;i*i<=n;i++){
            if(arr[i]){
                for(int j=i*i;j<=n;j+=i){
                    arr[j]=false;
                }
            }
        }
        System.out.println("Print 1 to "+n+" number:");
        for(int i=2;i<=n;i++){
            if(arr[i]){
                System.out.print(i+" ");
            }
        }
    }
}

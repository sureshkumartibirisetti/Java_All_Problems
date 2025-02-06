package Striver.DSA.a2z;

import java.util.Scanner;

public class pascalTriangle_0ms {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int r=in.nextInt();
        findEle(r);
    }
    static void findEle(int r){
        int ans=1;
        System.out.print(ans+" ");
        for(int i=1;i<r;i++){
            ans=ans*(r-i);
            ans=ans/i;
            System.out.print(ans+" ");
        }
    }
}

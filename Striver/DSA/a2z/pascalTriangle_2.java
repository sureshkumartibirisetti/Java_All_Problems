package Striver.DSA.a2z;

import java.util.Scanner;

//            1
//          1    1
//        1   2    1
//       1  3    3   1
//      1  4   6   4   1
//     1  5  10  10  5   1
public class pascalTriangle_2 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int r=in.nextInt();
        String s="";
        for(int i=1;i<=r;i++){
            s+=findElE(r-1,i-1)+" ";
        }
        System.out.println(s);
    }
    static int findElE(int n, int r){
        int res=1;
        for(int i=0;i<r;i++){
            res=res*(n-i);
            res=res/(i+1);
        }
        return res;
    }
}

package Striver.DSA.a2z;

import java.util.Scanner;

//            1
//          1    1
//        1   2    1
//       1  3    3   1
//      1  4   6   4   1
//     1  5  10  10  5   1
public class pascalTriangle_1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int r=in.nextInt();
        System.out.println(findElE(n-1,r-1));
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

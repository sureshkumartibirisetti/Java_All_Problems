package Striver.DSA.a2z;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class pascalTriangle_T {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int row=in.nextInt();
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=1;i<=row;i++){
            ans.add(gene(i));
        }
        System.out.println(ans);


    }
    static List<Integer> gene(int row){
        int ans=1;
        List<Integer> res=new ArrayList<>();
        res.add(ans);
        for(int i=1;i<row;i++){
            ans=ans*(row-i);
            ans=ans/i;
            res.add(ans);
        }
        return res;
    }

}

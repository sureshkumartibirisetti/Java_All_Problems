package Rough;

import java.util.ArrayList;
import java.util.List;

public class r1 {
    public static void main(String[] args) {
        int r=30;
        System.out.println(getRow(r));
    }
    public static List<Integer> getRow(int rowIndex) {
//        rowIndex=rowIndex+1;
        List<Integer> res=new ArrayList<>();
        long ans=1;
        res.add(1);
        for(int i=1;i<=rowIndex;i++){
            long n=(ans*(rowIndex-i+1))/i;
            res.add((int)n);
            ans=n;
        }
        return res;
    }
}

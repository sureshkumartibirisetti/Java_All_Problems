package Rough;

import java.util.ArrayList;
import java.util.List;

public class a {
    public static void main(String[] args) {
        List<List<Integer>> al=new ArrayList<>();
        for(int i=0;i<5;i++){
            List<Integer> al1=new ArrayList<>();
            al1.add(1);
            al1.add(2);
            al1.add(3);
            al.add(al1);

        }
        int[][] arr=new int[al.size()][];
        int a=0;
        for(int[] i:arr){
           // i[0]=al[a].get(0);
        }

    }
}

package Hyrtutorials.practice;

import java.util.ArrayList;

public class rough5 {
    public static void main(String[] args) {
        int[] arr={44,4,44,4,4,4,2,2,2,3,3,3,3,3,3,3,3,3,3,3,3,3,35,5,5,5,2,2,2,2,2,2,2,2,2,2};
        //{2,3,2,3,2,3,2,3,4,5,4,5,4,5};
        ArrayList<Integer> aE=new ArrayList<>();
        ArrayList<Integer> aO=new ArrayList<>();
        ArrayList<Integer> res=new ArrayList<>();
        for(int i: arr){
            if(i%2==0){
                aE.add(i);
            }else{
                aO.add(i);
            }
        }
        int i=0;
        while(i<aE.size() && i<aO.size()){
            res.add(aE.get(i));
            res.add(aO.get(i));
            i++;
        }
        if(aE.size()<aO.size()){
            for(int j=i;j<aO.size();j++){
                res.add(aO.get(j));
            }
        }else if(aE.size()>aO.size()){
            for(int k=i;k<aE.size();k++){
                res.add(aE.get(k));
            }
        }
        System.out.println(res);

    }
}

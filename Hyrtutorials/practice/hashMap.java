package Hyrtutorials.practice;

import java.util.HashMap;

public class hashMap {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,1,2,3,4,1,2,3,4};
        HashMap<Integer,Integer> hp=new HashMap<>();
        for(int i=0;i< arr.length;i++){
            hp.put(i,arr[i]);
        }
        System.out.println(hp);
    }
}

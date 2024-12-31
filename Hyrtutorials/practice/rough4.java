package Hyrtutorials.practice;

import java.util.HashSet;

public class rough4 {
    public static void main(String[] args) {
        int n=15;
        int[] arr={10,12,10,22,10,18,15,22,10,22,18,18,12,10,22};
        HashSet<Integer> al=new HashSet<>();
        for(int i:arr){
            al.add(i);
        }
        for(Integer i:al){
            int count=0;
            for(int j=0;j< arr.length;j++){
                if(i==arr[j]){
                    count++;
                }
            }
            System.out.println(i+"-"+count);
        }

    }
}
//Example:
//Input 1 :         15
//
//        10 12 10 22 10 18 15 22 10 22 18 18 12 10 22
//
//Output 1 :
//
//        10 - 5
//
//        18 - 3
//
//        15 - 1
//
//        12 - 2
//
//        22 - 4
//

package Hyrtutorials.practice;

import java.util.Arrays;

//Input: digits = [1,2,3,4]
//
//Output: [1,2,3,5]
public class rough14 {
    public static void main(String[] args) {
        int [] i={9,8,7,6,5,4,3,2,1,0};
        long c=0;
        for(int j:i){
            c=c*10+j;
        }
        c=c+1;
//        String s=Double.toString(c);
        System.out.println(c);
    }
}

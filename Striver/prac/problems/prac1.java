package Striver.prac.problems;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;


//In the String taken number and after that number is prime or not
public class prac1 {
    public static void main(String[] args) {
        String s="new int[]{25, 34, 45, 8, 9, 66, 91, 13, 17,97 ,2 ,3, 4};";
        String s1=s.substring(s.indexOf('{')+1,s.lastIndexOf('}'));
        String[] arr=s1.split(",");
        for(String i:arr){
            int j=Integer.parseInt(i.trim());
            if(isprime(j)){
                System.out.println(j);
            }
        }

    }
    static boolean isprime(int a){
        int c=0;
        if(a==0 || a==1){
            return false;
        }else{
            for(int i=2;i<=Math.sqrt(a);i++){
                if(a%i==0){
                    c++;
                }
            }
        }
        if(c==0) return true;
        return false;
    }
}

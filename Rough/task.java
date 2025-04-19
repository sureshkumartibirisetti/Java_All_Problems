package Rough;

import java.util.Arrays;

public class task {
    public static void main(String[] args) {
        String a="racecar";
        String b="carrace";
        String[] a1=a.split("");
        String[] a2=b.split("");
        if(a1.length!=a2.length){
            System.out.println("Not anagram");
        }
        else if(check(a1,a2)){
            System.out.println("anagram");
        }else{
            System.out.println("not anagram");
        }

    }
    static boolean check(String[] a1,String[] a2){
        Arrays.sort(a1);
        Arrays.sort(a2);
        for(int i=0;i<a1.length;i++){
            if(a1[i]!=a2[i]){
                return false;
            }
        }
        return true;
    }
}

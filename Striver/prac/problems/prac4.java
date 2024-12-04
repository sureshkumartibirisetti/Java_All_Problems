package Striver.prac.problems;

import java.util.Arrays;
//check anagram or not
public class prac4 {
    public static void main(String[] args) {
        String s="racecar";
        String s1="carrace";
        String[] arr=s.split("");
        String[] arr1=s1.split("");
        Arrays.sort(arr);
        Arrays.sort(arr1);
        int sum=0;
//        System.out.println(Arrays.toString(arr));
//        System.out.println(Arrays.toString(arr1));
        for(int i=0;i<arr.length;i++){
            if(arr[i].equals(arr1[i])){
                sum++;
            }
        }
        System.out.println(sum);
    }
}

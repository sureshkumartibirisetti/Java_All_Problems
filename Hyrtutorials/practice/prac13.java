package Hyrtutorials.practice;
import java.util.*;
public class prac13 {
    public static void main(String[] args) {
        int[] arr={4,4,4,4,4,5,5,5,5,2,3};
        for(int i=0;i<arr.length;i++){
            int count=0;
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count==1){
                System.out.println(arr[i]);
            }
        }
    }
}

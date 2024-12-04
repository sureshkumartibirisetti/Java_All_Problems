package Hyrtutorials.Strings;

import java.util.Scanner;

public class prac {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        String[] arr=s.split(" ");
        String fs="";
        for(int i=0;i<arr.length;i++){
            for(int j=arr[i].length()-1;j>=0;j--){
                fs+=arr[i].charAt(j);
            }
            fs+=" ";
        }
        System.out.println(fs);
    }
}

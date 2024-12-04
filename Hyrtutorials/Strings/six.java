package Hyrtutorials.Strings;

import java.util.Scanner;

public class six {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        String [] arr=s.split(" ");
        String fin="";
        for(int i=0;i<arr.length;i++){
            fin+=rev(arr[i]);
            fin+=" ";
        }
        System.out.println(fin.trim());

    }
    static String rev(String a){
        String s="";
        for(int i=a.length()-1;i>=0;i--){
            s+=a.charAt(i);
        }
        return s;
    }

}

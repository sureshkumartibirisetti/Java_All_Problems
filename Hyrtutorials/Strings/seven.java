package Hyrtutorials.Strings;

import java.util.Scanner;

public class seven {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        String[] arr=s.split(" ");
        String fs="";
        for(int i=1;i<= arr.length;i++){
            if(i%2==0){
                fs+=arr[i-1].toLowerCase();
                fs+=" ";

            }
            else{
                fs+=arr[i-1].toUpperCase();
                fs+=" ";
            }
        }
        System.out.println(fs.trim());
    }
}

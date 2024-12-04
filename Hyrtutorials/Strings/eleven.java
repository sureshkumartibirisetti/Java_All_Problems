package Hyrtutorials.Strings;

import java.util.Scanner;

public class eleven {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String fs="";
        String s=in.nextLine();
        String[] arr=s.split(" ");
        for(int i=0;i<arr.length;i++){
            if(fs.length()<arr[i].length()){
                fs=arr[i];
            }
        }
        System.out.println(fs);


    }
}

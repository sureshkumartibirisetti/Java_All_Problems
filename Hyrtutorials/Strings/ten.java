package Hyrtutorials.Strings;

import java.util.ArrayList;
import java.util.Scanner;

public class ten {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String a=in.nextLine();
        String[] arr=a.split(" ");
        ArrayList<String> fa = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(i%2!=0){
                fa.add("'"+ arr[i]+"'");
            }
        }
        System.out.println(fa);


    }
}

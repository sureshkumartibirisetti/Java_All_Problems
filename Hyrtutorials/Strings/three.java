package Hyrtutorials.Strings;

import java.util.Scanner;

public class three {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        char ch=in.next().charAt(0);
        int a=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==ch){
                a++;
            }
        }
        System.out.println(a);
    }
}

package Striver.prac.problems;

import java.util.Scanner;

public class table {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int x=in.nextInt();
        int y=1;
        tab(x,y);
    }
    static void tab(int x,int y){
        System.out.println(x+"*"+y+"="+(x*y));
        if(x==y){
            return ;
        }
        tab(x,y+1);
    }
}

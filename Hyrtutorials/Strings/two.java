package Hyrtutorials.Strings;

import java.util.Scanner;

public class two {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        System.out.println(s.split(" ").length);
    }
}

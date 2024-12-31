package CodeForces;

import java.util.Scanner;

public class WayTooLongWords {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        while(n-->0){
            String s=in.next();
            String s1="";
            if(s.length()<=4){
                System.out.println(s);
            }else{
                s1+=s.charAt(0);
                s1+=s.length()-2;
                s1+=s.charAt(s.length()-1);
                System.out.println(s1);
            }
        }
    }
}

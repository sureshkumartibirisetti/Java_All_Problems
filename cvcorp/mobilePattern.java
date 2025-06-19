package cvcorp;

import java.util.HashSet;

/*
      1    2    3
      *    *    *

      4    5    6
      *    *    *

      7    8    9
      *    *    *
 */
public class mobilePattern {
    public static void main(String[] args) {
        String s="7415369";
        boolean res=true;
        HashSet<Character> set=new HashSet<>();
        int i;
        for(i=0;i<s.length()-1;i++){
            set.add(s.charAt(i));
            int a=s.charAt(i)-'0';
            int b=s.charAt(i+1)-'0';
            int diff=Math.abs(a-b);
            //a=even && b=even a+b==10 ==> False
            if(a%2==0 && b%2==0){
                if(a+b==10){
                res=false;
                break;
                }
            }
            //((a=Even or b=Odd)or (a=odd or b=odd) or (a=odd or b=even)) && math.abs(a-b)=even ==> false
            else if(((a%2==0 || b%2!=0)||(a%2!=0 || b%2!=0)||(a%2!=0 || b%2==0)) && diff%2==0){
                res=false;
                break;
            }

        }
        for(int j=i;j<s.length();j++){
            set.add(s.charAt(j));
        }
        if(s.length()!= set.size()){
            res=false;
        }
        System.out.println(set);
        if(res) System.out.println("True");
        else System.out.println("False");
    }
}

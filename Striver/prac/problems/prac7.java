package Striver.prac.problems;
//Reverse a String
public class prac7 {
    public static void main(String[] args) {
        String s="Suresh";
        String s1="";
        for(int i=0;i<s.length();i++){
            s1=s.charAt(i)+s1;
        }
        System.out.println(s1);
    }
}

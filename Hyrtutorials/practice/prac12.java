package Hyrtutorials.practice;

public class prac12 {
    public static void main(String[] args) {
        String s1="Suresh";
        String s2="Suresh";
        String s3=new String("Suresh");
        String s4=new String("Suresh");
        System.out.println(s1==s2); //true
        System.out.println(s3==s4); //f
        System.out.println(s1.equals(s2)); //t
        System.out.println(s3.equals(s4)); //fa

    }
}

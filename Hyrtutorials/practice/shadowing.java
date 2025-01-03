package Hyrtutorials.practice;

public class shadowing {
    static int x=90;
    public static void main(String[] args) {
        System.out.println(x);
        int x;
        x=40;
        System.out.println(x);
        func();
    }
    static void func(){
        System.out.println(x);
    }
}

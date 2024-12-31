package Hyrtutorials.practice;

public class prac15  {
    static int a=10;
    String s;
    String c;
    int year;
    public prac15(String a,String b,int c){
        this.s=a;
        this.c=b;
        this.year=c;

    }
    void sum(int a,int b){
        System.out.println(a+b);
    }

    public static void main(String[] args) {
        prac15 myobj=new prac15("suresh","kumar",2024);
        System.out.println(myobj.s);
        System.out.println(myobj.c);
        System.out.println(myobj.year);
        System.out.println();
        String str = "Hello";
        int a=1;
        System.out.println(str instanceof String);
        myobj.sum(10,20);

    }
}

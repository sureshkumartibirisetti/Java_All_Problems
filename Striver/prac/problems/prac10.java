package Striver.prac.problems;
//fibonacci
public class prac10 {
    public static void main(String[] args) {
        int f0=0;
        int f1=1;
        for(int i=2;i<=5;i++){
            int last=f0+f1;
            f0=f1;
            f1=last;
        }
        System.out.println(f1);
    }
}

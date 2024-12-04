package Striver.Recursion;

public class palindrome {
    public static void main(String[] args) {
        String s="amadama";
        int a=s.length();
        System.out.println(func(s,0,a));
    }
    static boolean func(String s,int i,int l){
        if(i>=l/2){
            return true;
        }
        if(s.charAt(i)!=s.charAt(l-i-1)){
            return false;
        }
        return func(s,i+1,l);
    }
}

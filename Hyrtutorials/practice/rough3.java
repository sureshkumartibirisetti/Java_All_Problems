package Hyrtutorials.practice;

public class rough3 {
    public static void main(String[] args) {
        String s="abc";
        String t="bac";
        int sum=0;
        for(int i=0;i<s.length();i++){
            int a=i;
            char ch=s.charAt(i);
            for(int j=0;j<t.length();j++){
                if(ch==t.charAt(j)){
                    a=a-j;
                }
            }
            sum+=Math.abs(a);
        }
        System.out.println(sum);
    }
}

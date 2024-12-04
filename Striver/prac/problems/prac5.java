package Striver.prac.problems;
//check palindrome optimize solution(recursive method)
public class prac5 {
    public static void main(String[] args) {
        String s = "tab a cat";
        s=s.toLowerCase();
        String s1="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch>='a' && ch<='z'){
                s1+=ch;
            }
        }
        System.out.println(func(s1,0,s1.length()-1));
    }
    static boolean func(String s,int i,int j){
        if(i>=j){
            return true;
        } else if (s.charAt(i)!=s.charAt(j)) {
            return false;
        }
        return func(s,i+1,j-1);

    }
}

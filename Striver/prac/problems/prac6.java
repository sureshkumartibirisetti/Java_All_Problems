package Striver.prac.problems;
//check palindrome in string contains non alphanumeric characters also
public class prac6 {
    public static void main(String[] args) {
        String s="0p";
        s=s.toLowerCase();
        String s1="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch>='a' && ch<='z'|| ch>='0' && ch<='9'){
                s1+=ch;
            }
        }
        System.out.println(s1.length());
        if(s1.length()<=2){
//            return true;
            System.out.println("true");
        }
//        return func(s1,0,s1.length()-1);
        //System.out.println(func(s1,0,s1.length()-1));
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

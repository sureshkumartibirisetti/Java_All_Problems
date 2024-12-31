package Hyrtutorials.practice;

public class isSubsequence {
    public static void main(String[] args) {
        String s="acb";
        String t="ahbgdc";
        int c=0;
        int l=0;
        int h=t.length()-1;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            s1:
            while(l<=h){
                if(ch==t.charAt(l)){
                    c++;
                    l=l+1;
                    break s1;
                }
                else{
                    l++;
                }
            }

        }
        if(c==s.length()){
            System.out.println("true");
        }else {
            System.out.println("false");
        }
    }
}

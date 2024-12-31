package Hyrtutorials.practice;

public class rough1 {
    public static void main(String[] args) {
        String s="ab";
        String[] w={"ad","bd","aaab","baa","badab"};
        int count=0;
        for(int j=0;j<w.length;j++){
            String a=w[j];
            int l=0;
            for(int i=0;i<s.length();i++){
                char ch=s.charAt(i);
                for(int k=0;k<a.length();k++){
                    if(ch==a.charAt(k)){
                        l++;
                    }
                }
                if(l>=a.length()){
                    count++;
                }
                break;
            }
        }
        System.out.println(count);
    }
}

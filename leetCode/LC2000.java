package leetCode;

public class LC2000 {
    public static void main(String[] args) {
        String word="xyxzxe";
        char ch='z';
        String a="";
        if(word.contains(Character.toString(ch))){
            for(int i=0;i<word.length();i++){
                if(word.charAt(i)==ch){
                    a=word.charAt(i)+a;
                    for(int j=i+1;j<word.length();j++){
                        a+=word.charAt(j);
                    }
                    break;
                }
                else{
                    a=word.charAt(i)+a;
                }
            }
        }else{
            System.out.println(word);
        }
        System.out.println(a);
    }
}

package Rough;
/*
input :a=takeyouforward ,b=forward
output:substring found
 */
public class r13 {
    public static void main(String[] args) {
        String a="takeyouforward";
        String b="forward";
        int j=0;
        int x=0;
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)==b.charAt(j)){
                j++;
            }
        }
    }
}
//String a="takeyouforward";
//String b="forward";
//        if(a.contains(b)){
//        System.out.println("found");
//        }else{
//                System.out.println("Not found");
//        }
package leetCode;
//1309. Decrypt String from Alphabet to Integer Mapping
//Example 1:
//Input: s = "10#11#12"
//Output: "jkab"
//Explanation: "j" -> "10#" , "k" -> "11#" , "a" -> "1" , "b" -> "2".
//Example 2:
//Input: s = "1326#"
//Output: "acz"
public class LC1309 {
    public static void main(String[] args) {
        String s="10#11#12";
        String alpha="abcdefghijklmnopqrstuvwxyz";
        String res="";
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)=='#'){
                String a=s.substring(i-2,i);
                int a1=Integer.parseInt(a);
                res=alpha.charAt(a1-1)+res;
                i=i-2;
            }
            else{
                int a=s.charAt(i)-'0';
                res=alpha.charAt(a-1)+res;
            }
        }
        System.out.println(res);

    }
}

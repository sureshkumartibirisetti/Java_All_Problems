package leetCode;
//1844. Replace All Digits with Characters
//Input: s = "a1b2c3d4e"
//Output: "abbdcfdhe"
//Explanation: The digits are replaced as follows:
//        - s[1] -> shift('a',1) = 'b'
//        - s[3] -> shift('b',2) = 'd'
//        - s[5] -> shift('c',3) = 'f'
//        - s[7] -> shift('d',4) = 'h'
public class LC1844 {
    public static void main(String[] args) {
        String s="a1b2c3d4e";
        String res="";
        if(s.length()%2==0){
            for(int i=0;i<s.length();i+=2){
                res=res+s.charAt(i);
                int s1=(int)(s.charAt(i+1));
                res=res+(char)(s.charAt(i)+s1-48);
            }
        }else{
            for(int i=0;i<s.length()-1;i+=2){
                res=res+s.charAt(i);
                int s1=(int)(s.charAt(i+1));
                res=res+(char)(s.charAt(i)+s1-48);
            }
            res+=s.charAt(s.length()-1);
        }
        System.out.println(res);

    }
}

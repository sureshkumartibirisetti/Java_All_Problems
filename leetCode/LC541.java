package leetCode;
/*
541. Reverse String II
Example 1:
Input: s = "abcdefg", k = 2
Output: "bacdfeg"
Example 2:
Input: s = "abcd", k = 2
Output: "bacd"
 */
public class LC541 {
    public static void main(String[] args) {
        String s="abcdefg";
        int k=4;
        int a=0;
        int l=s.length()%k;
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length()-l;i+=k){
            if(a==0) {
                a=1;
                for (int j = i + k - 1; j >= ((i+k) - k);j--){
                    sb.append(s.charAt(j));
                }
            }else{
                a=0;
                for(int j=i;j<i+k;j++){
                    sb.append(s.charAt(j));
                }
            }
        }

        if(l<k){
            for(int i=s.length()-l;i<s.length();i++){
                sb.append(s.charAt(i));
            }
        }
        System.out.println(sb.toString());
    }
}

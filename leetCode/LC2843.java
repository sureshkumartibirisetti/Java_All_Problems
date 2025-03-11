package leetCode;
/*2843. Count Symmetric Integers
Example 1:
Input: low = 1, high = 100
Output: 9
Explanation: There are 9 symmetric integers between 1 and 100: 11, 22, 33, 44, 55, 66, 77, 88, and 99.
Example 2:
Input: low = 1200, high = 1230
Output: 4
Explanation: There are 4 symmetric integers between 1200 and 1230: 1203, 1212, 1221, and 1230.
 */
public class LC2843 {
    public static void main(String[] args) {
        int low=1200;
        int high=1230;
        int res=0;
        for(int i=low;i<=high;i++){
            int a=1+(int)(Math.floor(Math.log10(i)));
            if(a%2==0){
                if(sym(i)){
                    res++;
                    System.out.println(i);
                }
            }
        }
        System.out.println(res);

    }
    static boolean sym(int a){
        String s=String.valueOf(a);
        int l=0;
        int r=0;
        for(int i=0;i<s.length();i++){
            if(i<(s.length()/2)){
                l+=s.charAt(i)-'0';
            }else{
                r+=s.charAt(i)-'0';
            }
        }
        return l==r;
    }
}

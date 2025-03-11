package leetCode;
/*2496. Maximum Value of a String in an Array
Example 1:
Input: strs = ["alic3","bob","3","4","00000"]
Output: 5
Explanation:
        - "alic3" consists of both letters and digits, so its value is its length, i.e. 5.
        - "bob" consists only of letters, so its value is also its length, i.e. 3.
        - "3" consists only of digits, so its value is its numeric equivalent, i.e. 3.
        - "4" also consists only of digits, so its value is 4.
        - "00000" consists only of digits, so its value is 0.
Hence, the maximum value is 5, of "alic3".
Example 2:
Input: strs = ["1","01","001","0001"]
Output: 1
Explanation:
Each string in the array has value 1. Hence, we return 1.
 */
public class LC2496 {
    public static void main(String[] args) {
        String[] str={"iw1","61939","7","7i","cye","bv7yg","t3ye6","990"};
        int max=0;
        for(String i:str){
            String s="0123456789";
            int res=0;
            for(int j=0;j<i.length();j++){
                if(s.contains(i.charAt(j)+"")){
                    res=1;
                }else{
                    if(max<i.length()){
                        max=i.length();
                        res=0;
                    }
                    res=0;
                    break;
                }
            }
            if(res!=0){
                int a=Integer.parseInt(i);
                if(max<a){
                    max=a;
                }
            }
        }
        System.out.println(max);
    }
}

package leetCode;
/*
504. Base 7
Example 1:
Input: num = 100
Output: "202"
Example 2:
Input: num = -7
Output: "-10"
 */
public class LC504 {
    public static void main(String[] args) {
        int num=-7;
        int temp=num;
        num=Math.abs(num);
        String res="";
        while(num!=0){
            int temp1=num%7;
            res=temp1+res;
            num/=7;
        }
        if(temp<0){
            res="-"+res;
        }
        System.out.println(res);
    }
}

package leetCode;
/*
476. Number Complement
Example 1:
Input: num = 5
Output: 2
Explanation: The binary representation of 5 is 101 (no leading zero bits), and its complement is 010. So you need to output 2.
Example 2:
Input: num = 1
Output: 0
Explanation: The binary representation of 1 is 1 (no leading zero bits), and its complement is 0. So you need to output 0.
 */
public class LC476 {
    public static void main(String[] args) {
        int num=5;
        String s=Integer.toBinaryString(num);
        String s1="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                s1+='0';
            }else{
                s1+='1';
            }
        }
        System.out.println(Integer.parseInt(s1,2));
    }
}

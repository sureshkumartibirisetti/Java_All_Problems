package leetCode;
/*
415. Add Strings
Example 1:
Input: num1 = "11", num2 = "123"
Output: "134"
Example 2:
Input: num1 = "456", num2 = "77"
Output: "533"
Example 3:
Input: num1 = "0", num2 = "0"
Output: "0"

 */
import java.math.BigInteger;
public class LC415 {
    public static void main(String[] args){
        String num1="11";
        String num2="123";
        BigInteger a=new BigInteger(num1);
        BigInteger b=new BigInteger(num2);
        BigInteger c=a.add(b);
        System.out.println(String.valueOf(c));

    }
}

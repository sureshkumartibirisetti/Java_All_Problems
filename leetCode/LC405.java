package leetCode;
/*
405. Convert a Number to Hexadecimal
Example 1:
Input: num = 26
Output: "1a"
Example 2:
Input: num = -1
Output: "ffffffff"
 */
public class LC405 {
    public static void main(String[] args) {
        int num=-23456;
        if (num == 0) System.out.println("0");

        String hex_chars = "0123456789abcdef";
        String res = "";
        num &= 0xFFFFFFFF;

        while (num > 0) {
            res = hex_chars.charAt(num % 16) + res;
            num /= 16;
        }
        System.out.println(res);
    }
}

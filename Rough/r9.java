package Rough;

import java.util.Arrays;

public class r9 {

    // Function to multiply two numbers using addition
    public static int multiply(int a, int b) {
        int result = 0;
        for (int i = 0; i < b; i++) {
            result += a;
        }

        return result;
    }

    // Function to compute a^b without using *, **, or built-in methods
    public static int power(int base, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result = multiply(result, base);
        }
        return result;
    }

    public static void main(String[] args) {
        int base = 2;
        int exponent = 5;
        int result = power(base, exponent);
        System.out.println("2^5 = " + result); // Output: 32
    }
}

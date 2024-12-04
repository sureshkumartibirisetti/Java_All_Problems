package InterviewProblems;
//calculate the HCF_LCM_Calculator while using while loop
import java.util.Scanner;

public class HCF_LCM_Calculator {

    // Method to calculate HCF using Euclidean algorithm
    public static int calculateHCF(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }


    // Method to calculate LCM
    public static int calculateLCM(int a, int b, int hcf) {
        return (a * b) / hcf;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        // Calculate HCF
        int hcf = calculateHCF(num1, num2);
        System.out.println("HCF of " + num1 + " and " + num2 + " is: " + hcf);

        // Calculate LCM using the formula: LCM(a, b) = (a * b) / HCF(a, b)
        int lcm = calculateLCM(num1, num2, hcf);
        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm);

        sc.close();
    }
}

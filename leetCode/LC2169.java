package leetCode;
/*2169. Count Operations to Obtain Zero
Example 1:
Input: num1 = 2, num2 = 3
Output: 3
Explanation:
        - Operation 1: num1 = 2, num2 = 3. Since num1 < num2, we subtract num1 from num2 and get num1 = 2, num2 = 3 - 2 = 1.
        - Operation 2: num1 = 2, num2 = 1. Since num1 > num2, we subtract num2 from num1.
- Operation 3: num1 = 1, num2 = 1. Since num1 == num2, we subtract num2 from num1.
        Now num1 = 0 and num2 = 1. Since num1 == 0, we do not need to perform any further operations.
So the total number of operations required is 3.
Example 2:
Input: num1 = 10, num2 = 10
Output: 1
Explanation:
        - Operation 1: num1 = 10, num2 = 10. Since num1 == num2, we subtract num2 from num1 and get num1 = 10 - 10 = 0.
Now num1 = 0 and num2 = 10. Since num1 == 0, we are done.
So the total number of operations required is 1.
 */
public class LC2169 {
    public static void main(String[] args) {
        int num1=10;
        int num2=10;
        int c=0;
        while(num1!=0 && num2!=0){
            if(num1>=num2){
                num1=num1-num2;
            }else{
                num2=num2-num1;
            }
            c++;
        }
        System.out.println(c);
    }
}

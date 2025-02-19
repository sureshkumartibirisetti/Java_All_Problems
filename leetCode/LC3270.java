package leetCode;
//3270. Find the Key of the Numbers
//Example 1:
//Input: num1 = 1, num2 = 10, num3 = 1000
//Output: 0
//Explanation:
//        On padding, num1 becomes "0001", num2 becomes "0010", and num3 remains "1000".
//The 1st digit of the key is min(0, 0, 1).
//The 2nd digit of the key is min(0, 0, 0).
//The 3rd digit of the key is min(0, 1, 0).
//The 4th digit of the key is min(1, 0, 0).
//Example 2:
//Input: num1 = 987, num2 = 879, num3 = 798
//Output: 777
//Example 3:
//Input: num1 = 1, num2 = 2, num3 = 3
//Output: 1
public class LC3270 {
    public static void main(String[] args) {
        int num1=1;
        int num2=2;
        int num3=3;
        int ans=0;
        int count=1;
        int i=0;
        while(i<4){
            int min=Math.min(num1 % 10,Math.min(num2 % 10,num3 % 10));
            ans=ans+min*count;
            num1/=10;
            num2/=10;
            num3/=10;
            count*=10;
            i++;
        }
        System.out.println(ans);
    }
}

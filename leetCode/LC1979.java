package leetCode;
//1979. Find Greatest Common Divisor of Array
//Example 1:
//Input: nums = [2,5,6,9,10]
//Output: 2
//Explanation:
//The smallest number in nums is 2.
//The largest number in nums is 10.
//The greatest common divisor of 2 and 10 is 2.
//Example 2:
//Input: nums = [7,5,6,8,3]
//Output: 1
//Explanation:
//The smallest number in nums is 3.
//The largest number in nums is 8.
//The greatest common divisor of 3 and 8 is 1.
//Example 3:
//Input: nums = [3,3]
//Output: 3
//Explanation:
//The smallest number in nums is 3.
//The largest number in nums is 3.
//The greatest common divisor of 3 and 3 is 3.
public class LC1979 {
    public static void main(String[] args) {
        int[] nums={3,3};
        int min=nums[0];
        int max=nums[0];
        for(int i=1;i<nums.length;i++){
            if(min>nums[i]){
                min=nums[i];
            }if(max<nums[i]){
                max=nums[i];
            }
        }
        System.out.println(calculateHCF(min,max));
    }
    public static int calculateHCF(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}

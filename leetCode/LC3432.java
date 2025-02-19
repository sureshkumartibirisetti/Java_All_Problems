package leetCode;
//3432. Count Partitions with Even Sum Difference
//Example 1:
//Input: nums = [10,10,3,7,6]
//Output: 4
//Explanation:
//The 4 partitions are:
//        [10], [10, 3, 7, 6] with a sum difference of 10 - 26 = -16, which is even.
//[10, 10], [3, 7, 6] with a sum difference of 20 - 16 = 4, which is even.
//[10, 10, 3], [7, 6] with a sum difference of 23 - 13 = 10, which is even.
//[10, 10, 3, 7], [6] with a sum difference of 30 - 6 = 24, which is even.
//        Example 2:
//Input: nums = [1,2,2]
//Output: 0
//Explanation:
//No partition results in an even sum difference.
//
//Example 3:
//Input: nums = [2,4,6,8]
//Output: 3
//Explanation:
//All partitions result in an even sum difference.
public class LC3432 {
    public static void main(String[] args) {
        int[] nums={2,4,6,8};
        int sum=0;
        for(int i=0;i<nums.length-1;i++){
            int a=0;
            int b=0;
            for(int j=0;j<=i;j++){
                a+=nums[j];
            }
            for(int k=i+1;k<nums.length;k++){
                b+=nums[k];
            }
            if(Math.abs(a-b)%2==0){
                sum++;
            }
        }
        System.out.println(sum);
    }
}

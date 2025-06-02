package leetCode;

/*
3550. Smallest Index With Digit Sum Equal to Index
Example 1:
Input: nums = [1,3,2]
Output: 2
Explanation:
For nums[2] = 2, the sum of digits is 2, which is equal to index i = 2. Thus, the output is 2.
Example 2:
Input: nums = [1,10,11]
Output: 1
Explanation:
For nums[1] = 10, the sum of digits is 1 + 0 = 1, which is equal to index i = 1.
For nums[2] = 11, the sum of digits is 1 + 1 = 2, which is equal to index i = 2.
Since index 1 is the smallest, the output is 1.
Example 3:
Input: nums = [1,2,3]
Output: -1
Explanation:
Since no index satisfies the condition, the output is -1.
 */
public class LC3550 {
    public static void main(String[] args) {
        int[] arr={1,3,2};
        int res=0;
        for(int i=0;i<arr.length;i++){
            if(i==isCheck(arr[i])){
                res=i;
                break;
            }
        }
        System.out.println(res);
    }
    static int isCheck(int a){
        int temp=0;
        while(a>0){
            int temp1=a%10;
            temp+=temp1;
            a/=10;
        }
        return temp;
    }
}

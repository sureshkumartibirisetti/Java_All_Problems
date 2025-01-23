package leetCode;

import java.util.Arrays;

//Input: numbers = [2,7,11,15], target = 9
//Output: [1,2]
public class LC167 {
    public static void main(String[] args) {
        int[] numbers={2,7,11,15};
        int target=9;
        int left=0;
        int right=numbers.length-1;
        int[] res=new int[2];
        while(left<=right) {
            int sum = numbers[left] + numbers[right];
            if (sum == target) {
                res[0] = left;
                res[1] = right;
                System.out.println(Arrays.toString(res));
                break;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
    }
}

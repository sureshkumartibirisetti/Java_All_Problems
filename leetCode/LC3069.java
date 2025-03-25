package leetCode;

import java.util.ArrayList;

/*3069. Distribute Elements Into Two Arrays I
Example 1:
Input: nums = [2,1,3]
Output: [2,3,1]
Explanation: After the first 2 operations, arr1 = [2] and arr2 = [1].
In the 3rd operation, as the last element of arr1 is greater than the last element of arr2 (2 > 1), append nums[3] to arr1.
After 3 operations, arr1 = [2,3] and arr2 = [1].
Hence, the array result formed by concatenation is [2,3,1].
Example 2:
Input: nums = [5,4,3,8]
Output: [5,3,4,8]
Explanation: After the first 2 operations, arr1 = [5] and arr2 = [4].
In the 3rd operation, as the last element of arr1 is greater than the last element of arr2 (5 > 4), append nums[3] to arr1, hence arr1 becomes [5,3].
In the 4th operation, as the last element of arr2 is greater than the last element of arr1 (4 > 3), append nums[4] to arr2, hence arr2 becomes [4,8].
After 4 operations, arr1 = [5,3] and arr2 = [4,8].
Hence, the array result formed by concatenation is [5,3,4,8].
 */
public class LC3069 {
    public static void main(String[] args) {
        int[] nums={2,1,3};
        ArrayList<Integer> al1=new ArrayList<>();
        ArrayList<Integer> al2=new ArrayList<>();
        al1.add(nums[0]);
        al2.add(nums[1]);
        for(int i=2;i<nums.length;i++){
            if(al1.get(al1.size()-1)>al2.get(al2.size()-1)){
                al1.add(nums[i]);
            }else{
                al2.add(nums[i]);
            }
        }

        System.out.println(al1.toArray());
    }
}

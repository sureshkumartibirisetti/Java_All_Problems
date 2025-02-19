package leetCode;

import java.util.HashSet;

//2960. Count Tested Devices After Test Operations
//Example 1:
//Input: batteryPercentages = [1,1,2,1,3]
//Output: 3
//Explanation: Performing the test operations in order starting from device 0:
//At device 0, batteryPercentages[0] > 0, so there is now 1 tested device, and batteryPercentages becomes [1,0,1,0,2].
//At device 1, batteryPercentages[1] == 0, so we move to the next device without testing.
//At device 2, batteryPercentages[2] > 0, so there are now 2 tested devices, and batteryPercentages becomes [1,0,1,0,1].
//At device 3, batteryPercentages[3] == 0, so we move to the next device without testing.
//At device 4, batteryPercentages[4] > 0, so there are now 3 tested devices, and batteryPercentages stays the same.
//So, the answer is 3.
//Example 2:
//Input: batteryPercentages = [0,1,2]
//Output: 2
//Explanation: Performing the test operations in order starting from device 0:
//At device 0, batteryPercentages[0] == 0, so we move to the next device without testing.
//At device 1, batteryPercentages[1] > 0, so there is now 1 tested device, and batteryPercentages becomes [0,1,1].
//At device 2, batteryPercentages[2] > 0, so there are now 2 tested devices, and batteryPercentages stays the same.
//So, the answer is 2.
public class LC2960 {
    public static void main(String[] args) {
        int[] nums={2,1};
        int res=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                res++;
                for(int j=i+1;j< nums.length;j++){
                    nums[j]=nums[j]-nums[i];
                }
            }
        }
        System.out.println(res);
    }
}

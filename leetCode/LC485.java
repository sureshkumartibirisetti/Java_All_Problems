package leetCode;
//485. Max Consecutive Ones
//        Easy
//Topics
//        Companies
//Hint
//Given a binary array nums, return the maximum number of consecutive 1's in the array.
//
//
//
//Example 1:
//
//Input: nums = [1,1,0,1,1,1]
//Output: 3
//Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.
public class LC485 {
    public static void main(String[] args) {
        int[] nums={1,1,0,1,1,1};
        int c =0;
        int max1 =0;
        for(int i:nums){
            if(i==1){
                c +=1;
            }else{
                c =0;
            }
            if(max1 > c){
                max1=max1;
            }else{
                max1=c;
            }
        }
        System.out.println(max1);

    }
}
//if(nums.length==1 && nums[0]==1){
//        System.out.println(res+1);
//        }
//                for(int i=0;i<nums.length-1;i++){
//int temp=0;
//            for(int j=i+1;j<nums.length;j++){
//        if(nums[i]==1 && nums[j]==1){
//temp=j-i+1;
//        }else if(nums[i]==1 || nums[j]==1){
//temp=1;
//        }
//        else{
//        break;
//        }
//        }if(res<temp){
//res=temp;
//            }
//                    }
//                    System.out.println(res);

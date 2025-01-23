package leetCode;
//Input: nums = [3,4,5,2]
//Output: 12
//Explanation: If you choose the indices i=1 and j=2 (indexed from 0), you
//will get the maximum value, that is,
//(nums[1]-1)*(nums[2]-1) = (4-1)*(5-1) = 3*4 = 12.
public class LC1464 {
    public static void main(String[] args) {
        int[] nums={3,4,5,2};
        int max1=0;
        int max2=0;
        for(int i: nums){
            if(i>max1){
                max1=i;
                max2=max1;
            }
            if(max1>i && max2<i){
                max2=i;
            }
        }

        System.out.println(max1);
        System.out.println(max2);
        System.out.println((max1-1)*(max2-1));
    }
}

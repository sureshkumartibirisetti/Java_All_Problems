package Rough;

public class r5 {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6,1,2,3,4,5,6,9,9};
        int flarge=nums[0];
        int slarge=-1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>=flarge){
                int temp=flarge;
                flarge=nums[i];
                slarge=temp;
            }
        }
        System.out.println(flarge);
        System.out.println(slarge);
    }
}

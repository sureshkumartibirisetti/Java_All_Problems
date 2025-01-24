package leetCode;
//Input: nums = [1,2,3,4,10]
//
//Output: false
public class LC3232 {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,14};
        int ali=0;
        int bob=0;
        for(int i=0;i<nums.length;i++){
            if((nums[i]/10)==0){
                ali+=nums[i];
            }else{
                bob+=nums[i];
            }
        }
        if(ali!=bob){
            System.out.println("true");
        }else{
            System.out.println("False");
        }
    }
}

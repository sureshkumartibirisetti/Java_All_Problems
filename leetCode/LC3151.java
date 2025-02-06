package leetCode;
//3151. Special Array I
//Input: nums = [2,1,4]
//Output: true
//Explanation:
//There is only two pairs: (2,1) and (1,4),
//and both of them contain numbers with different parity.
//So the answer is true.
public class LC3151 {
    public static void main(String[] args) {
        int[] nums={2,1,4};
        if(nums.length==1){
            System.out.println("true");
        }else{
            for(int i=0;i< nums.length-1;i++){
                if((nums[i]+nums[i+1])%2==0){
                    System.out.println("false");
                }
            }
            System.out.println("true");
        }
    }
}

package leetCode;

public class LC2367 {
    public static void main(String[] args) {
        int[] nums={0,1,4,6,7,10};
        int diff=3;
        int count=0;
        for(int i=0;i<nums.length;i++){
            int a=0;
            int b=0;
            for(int j=i+1;j< nums.length;j++){
                if(nums[j]-nums[i]==diff){
                    a++;
                    b=j;
                }
            }
            for(int k=b;k<nums.length;k++){

            }

        }
    }
}

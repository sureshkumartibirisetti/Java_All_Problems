package leetCode;
//3300. Minimum Element After Replacement With Digit Sum
//Input: nums = [10,12,13,14]
//
//Output: 1
public class LC3300 {
    public static void main(String[] args) {
         int[] nums={10,12,13,14};
         int res=Integer.MAX_VALUE;
         for(int i:nums){
             int s=MinEle(i);
             if(res>s){
                 res=s;
             }
         }
        System.out.println(res);
    }
    static int MinEle(int i){
        int s=0;
        while(i>0){
            int rem=i%10;
            s+=rem;
            i/=10;
        }
        return s;
    }
}

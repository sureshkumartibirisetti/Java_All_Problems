package Striver.Algorithms;
//nums=[1,2,3,4,5,6,7,8]
//k=4
//maximum sum consectutive sum
public class twoPointer_constantWindow {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6,7,8,9,2,1};
        int k=4;
        int l=0;
        int r=k-1;
        int max=0;
        while(r!=nums.length){
            int max1=0;
            for(int i=l;i<=r;i++){
                max1+=nums[i];
            }
            if(max<max1){
                max=max1;
            }
            l++;
            r++;
        }
        System.out.println(max);
    }
}

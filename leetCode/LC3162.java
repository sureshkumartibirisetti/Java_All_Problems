package leetCode;

public class LC3162 {
    public static void main(String[] args) {
        int[] nums1={1,3,4};
        int[] nums2={1,3,4};
        int k=1;
        int res=0;
        for(int i:nums1){
            for(int j:nums2){
                if(i%(j*k)==0){
                    res+=1;
                }
            }
        }
        System.out.println(res);

    }
}

package leetCode;

public class LC2859 {
    public static void main(String[] args) {
        int a=10;
        System.out.println((Integer.toBinaryString(a)));
        int[] nums={5,10,1,5,2};
        int k=1;
        int res=0;
        for(int i=0;i<nums.length;i++){
            String s=Integer.toBinaryString(i);
            int c=0;
            for(int j=0;j<s.length();j++){
                if(s.charAt(j)=='1'){
                    c++;
                }
            }
            if(c==k){
                res+=nums[i];
            }
        }
        System.out.println(res);
    }
}

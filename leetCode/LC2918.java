package leetCode;
/*
2918. Minimum Equal Sum of Two Arrays After Replacing Zeros
Example 1:
Input: nums1 = [3,2,0,1,0], nums2 = [6,5,0]
Output: 12
Explanation: We can replace 0's in the following way:
- Replace the two 0's in nums1 with the values 2 and 4. The resulting array is nums1 = [3,2,2,1,4].
- Replace the 0 in nums2 with the value 1. The resulting array is nums2 = [6,5,1].
Both arrays have an equal sum of 12. It can be shown that it is the minimum sum we can obtain.
Example 2:
Input: nums1 = [2,0,2,0], nums2 = [1,4]
Output: -1
Explanation: It is impossible to make the sum of both arrays equal.
 */
public class LC2918 {
    public static void main(String[] args) {
        int[] nums1={3,2,0,1,0};
        int[] nums2={6,5,0};
        int s1=0,s2=0,z1=0,z2=0;
        for(int i:nums1){
            if(i==0){
                z1+=1;
            }
            else{
                s1+=i;
            }
        }
        for(int i:nums2){
            if(i==0){
                z2+=1;
            }
            else{
                s2+=i;
            }
        }
        int c_s1=s1+z1;
        int c_s2=s2+z2;
        if((z1==0)&&(s1<c_s2)){
            System.out.println(-1);
        }
        if((z2==0)&&(s2<c_s1)){
            System.out.println(-1);
        }
        System.out.println(Math.max(c_s1,c_s2));
    }
}

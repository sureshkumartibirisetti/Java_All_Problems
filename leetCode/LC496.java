package leetCode;

import java.util.Arrays;

/*
496. Next Greater Element I
Example 1:
Input: nums1 = [4,1,2], nums2 = [1,3,4,2]
Output: [-1,3,-1]
Explanation: The next greater element for each value of nums1 is as follows:
- 4 is underlined in nums2 = [1,3,4,2]. There is no next greater element, so the answer is -1.
- 1 is underlined in nums2 = [1,3,4,2]. The next greater element is 3.
- 2 is underlined in nums2 = [1,3,4,2]. There is no next greater element, so the answer is -1.
Example 2:
Input: nums1 = [2,4], nums2 = [1,2,3,4]
Output: [3,-1]
Explanation: The next greater element for each value of nums1 is as follows:
- 2 is underlined in nums2 = [1,2,3,4]. The next greater element is 3.
- 4 is underlined in nums2 = [1,2,3,4]. There is no next greater element, so the answer is -1.
 */
public class LC496 {
    public static void main(String[] args) {
        int[] nums1={2,4};
        int[] nums2={1,2,3,4};
        int[] res=new int[nums1.length];
        int a=0;
        for(int i=0;i<nums1.length;i++){
            int s=-1;
            boolean s1=false;
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    s1=true;
                }
                if(s1){
                    if(nums1[i]<nums2[j]){
                        res[a]=nums2[j];
                        a++;
                        s=nums2[j];
                        break;
                    }
                }
            }
            if(s==-1){
                res[a]=s;
                a++;
            }
        }
        System.out.println(Arrays.toString(res));
    }
}

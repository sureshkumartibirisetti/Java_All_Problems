package leetCode;
//Input: nums1 = [2,6,4], nums2 = [9,7,5]
//Output: 3
//Explanation:
//The integer added to each element of nums1 is 3.
public class LC3131 {
    public static void main(String[] args) {
        int[] nums1={2,6,4};
        int[] nums2={9,7,5};
        System.out.println(minNum(nums2)-minNum(nums1));
    }
    static int minNum(int[] arr){
        int min=arr[0];
        for(int i=0;i< arr.length;i++){
            if(min>arr[i]){
                min=arr[i];
            }
        }
        return min;
    }
}

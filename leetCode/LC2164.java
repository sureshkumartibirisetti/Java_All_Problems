package leetCode;

import java.util.Arrays;

/*
2164. Sort Even and Odd Indices Independently
Example 1:
Input: nums = [4,1,2,3]
Output: [2,3,4,1]
Explanation:
First, we sort the values present at odd indices (1 and 3) in non-increasing order.
So, nums changes from [4,1,2,3] to [4,3,2,1].
Next, we sort the values present at even indices (0 and 2) in non-decreasing order.
So, nums changes from [4,1,2,3] to [2,3,4,1].
Thus, the array formed after rearranging the values is [2,3,4,1].
Example 2:
Input: nums = [2,1]
Output: [2,1]
Explanation:
Since there is exactly one odd index and one even index, no rearrangement of values takes place.
The resultant array formed is [2,1], which is the same as the initial array.
 */
public class LC2164 {
    public static void main(String[] args) {
        int[] nums={5,39,33,5,12,27,20,45,14,25,32,33,30,30,9,14,44,15,21};
        int l=nums.length;
        if(l%2==0){
            int[] a=new int[l/2];
            int[] b=new int[l/2];
            int s=0,s1=0;
            for(int i=0;i<nums.length;i++){
                if(i%2==0){
                    a[s]=nums[i];
                    s++;
                }else{
                    b[s1]=nums[i];
                    s1++;
                }
            }
            Arrays.sort(a);
            Arrays.sort(b);
            int x=0,y=b.length-1;
            while(x<y){
                int temp=b[x];
                b[x]=b[y];
                b[y]=temp;
                x++;
                y--;
            }
            int t=0;
            int t1=0;
            for(int i=0;i<l;i++){
                if(i%2==0){
                   nums[i]=a[t];
                   t++;
                }else{
                    nums[i]=b[t1];
                    t1++;
                }
            }
            System.out.println(Arrays.toString(nums));

        }else{
            int[] a=new int[l/2+1];
            int[] b=new int[l/2];
            int s=0,s1=0;
            for(int i=0;i<nums.length;i++){
                if(i%2==0){
                    a[s]=nums[i];
                    s++;
                }else{
                    b[s1]=nums[i];
                    s1++;
                }
            }
            Arrays.sort(a);
            Arrays.sort(b);
            int x=0,y=b.length-1;
            while(x<y){
                int temp=b[x];
                b[x]=b[y];
                b[y]=temp;
                x++;
                y--;
            }
            int t=0;
            int t1=0;
            for(int i=0;i<l;i++){
                if(i%2==0){
                    nums[i]=a[t];
                    t++;
                }else{
                    nums[i]=b[t1];
                    t1++;
                }
            }
            System.out.println(Arrays.toString(nums));
        }
    }
}

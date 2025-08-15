package leetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/*
697. Degree of an Array
Example 1:
Input: nums = [1,2,2,3,1]
Output: 2
Explanation:
The input array has a degree of 2 because both elements 1 and 2 appear twice.
Of the subarrays that have the same degree:
[1, 2, 2, 3, 1], [1, 2, 2, 3], [2, 2, 3, 1], [1, 2, 2], [2, 2, 3], [2, 2]
The shortest length is 2. So return 2.
Example 2:
Input: nums = [1,2,2,3,1,4,2]
Output: 6
Explanation:
The degree is 3 because the element 2 is repeated 3 times.
So [2,2,3,1,4,2] is the shortest subarray, therefore returning 6.
Constraints:
nums.length will be between 1 and 50,000.
nums[i] will be an integer between 0 and 49,999.
 */
public class LC697 {
    public static void main(String[] args) {
        int[] nums={1,2,2,3,1,4,2};
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        List<Integer> list=new ArrayList<>();
        int j=0;
        for(int i:map.values()){
            if(j<i) j=i;
        }
        for(int i: map.keySet()){
            if(map.get(i)==j) list.add(i);
        }
        int res=Integer.MAX_VALUE;
        for(int i:list){
            int a=0;
            int b=nums.length-1;
            int l=0,lv=0;
            int r=0,rv=0;
            while(a<b){
                if(nums[a]==i && l==0){
                    l++;
                    lv=a;
                    a-=1;
                }if(nums[b]==i && r==0){
                    r++;
                    rv=b;
                    b+=1;
                }
                if(l>=1 && r>=1){
                    break;
                }
                a++;
                b--;
            }
            if(res>(rv-lv+1)){
                res=rv-lv+1;
            }

        }
        System.out.println(res);

    }
}
